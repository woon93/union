package com.union.ueditor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.baidu.ueditor.define.ActionMap;

/**
 * 配置管理器
 * @author hancong03@baidu.com
 *
 */
public final class ConfigManager {

	private final String rootPath;
	private final String originalPath;
	private final String contextPath;
	private static final String configFileName = "config.json";
	private String parentPath = null;
	private JSONObject jsonConfig = null;
	// 涂鸦上传filename定义
	private final static String SCRAWL_FILE_NAME = "scrawl";
	// 远程图片抓取filename定义
	private final static String REMOTE_FILE_NAME = "remote";
	
	/*
	 * 通过一个给定的路径构建一个配置管理器， 该管理器要求地址路径所在目录下必须存在config.properties文件
	 */
	private ConfigManager ( String rootPath, String contextPath, String uri ) throws FileNotFoundException, IOException {
		
		rootPath = rootPath.replace( "\\", "/" );
		
		this.rootPath = rootPath;
		this.contextPath = contextPath;
		
		if ( contextPath.length() > 0 ) {
			this.originalPath = this.rootPath + uri.substring( contextPath.length() );
		} else {
			this.originalPath = this.rootPath + uri;
		}
		
		this.initEnv();
		
	}
	
	/**
	 * 配置管理器构造工厂
	 * @param rootPath 服务器根路径
	 * @param contextPath 服务器所在项目路径
	 * @param uri 当前访问的uri
	 * @return 配置管理器实例或者null
	 */
	public static ConfigManager getInstance ( String rootPath, String contextPath, String uri ) {
		
		try {
			return new ConfigManager(rootPath, contextPath, uri);
		} catch ( Exception e ) {
			return null;
		}
		
	}
	
	// 验证配置文件加载是否正确
	public boolean valid () {
		return this.jsonConfig != null;
	}
	
	public JSONObject getAllConfig () {
		
		return this.jsonConfig;
		
	}
	
	public Map<String, Object> getConfig ( int type ) {
		
		Map<String, Object> conf = new HashMap<String, Object>();
		String savePath = null;
		
		switch ( type ) {
		
			case ActionMap.UPLOAD_FILE:
				conf.put( "isBase64", "false" );
				try {
					conf.put( "maxSize", this.jsonConfig.getLong( "fileMaxSize" ) );
				} catch (JSONException e) {
					e.printStackTrace();
				}
				conf.put( "allowFiles", this.getArray( "fileAllowFiles" ) );
				try {
					conf.put( "fieldName", this.jsonConfig.getString( "fileFieldName" ) );
				} catch (JSONException e) {
					e.printStackTrace();
				}
				try {
					savePath = this.jsonConfig.getString( "filePathFormat" );
				} catch (JSONException e) {
					e.printStackTrace();
				}
				break;
				
			case ActionMap.UPLOAD_IMAGE:
				conf.put( "isBase64", "false" );
				try {
					conf.put( "maxSize", this.jsonConfig.getLong( "imageMaxSize" ) );
				} catch (JSONException e) {
					e.printStackTrace();
				}
				conf.put( "allowFiles", this.getArray( "imageAllowFiles" ) );
				try {
					conf.put( "fieldName", this.jsonConfig.getString( "imageFieldName" ) );
				} catch (JSONException e) {
					e.printStackTrace();
				}
				try {
					savePath = this.jsonConfig.getString( "imagePathFormat" );
				} catch (JSONException e) {
					e.printStackTrace();
				}
				break;
				
			case ActionMap.UPLOAD_VIDEO:
				try {
					conf.put( "maxSize", this.jsonConfig.getLong( "videoMaxSize" ) );
				} catch (JSONException e) {
					e.printStackTrace();
				}
				conf.put( "allowFiles", this.getArray( "videoAllowFiles" ) );
				try {
					conf.put( "fieldName", this.jsonConfig.getString( "videoFieldName" ) );
				} catch (JSONException e) {
					e.printStackTrace();
				}
				try {
					savePath = this.jsonConfig.getString( "videoPathFormat" );
				} catch (JSONException e) {
					e.printStackTrace();
				}
				break;
				
			case ActionMap.UPLOAD_SCRAWL:
				conf.put( "filename", ConfigManager.SCRAWL_FILE_NAME );
				try {
					conf.put( "maxSize", this.jsonConfig.getLong( "scrawlMaxSize" ) );
				} catch (JSONException e) {
					e.printStackTrace();
				}
				try {
					conf.put( "fieldName", this.jsonConfig.getString( "scrawlFieldName" ) );
				} catch (JSONException e) {
					e.printStackTrace();
				}
				conf.put( "isBase64", "true" );
				try {
					savePath = this.jsonConfig.getString( "scrawlPathFormat" );
				} catch (JSONException e) {
					e.printStackTrace();
				}
				break;
				
			case ActionMap.CATCH_IMAGE:
				conf.put( "filename", ConfigManager.REMOTE_FILE_NAME );
				conf.put( "filter", this.getArray( "catcherLocalDomain" ) );
				try {
					conf.put( "maxSize", this.jsonConfig.getLong( "catcherMaxSize" ) );
				} catch (JSONException e) {
					e.printStackTrace();
				}
				conf.put( "allowFiles", this.getArray( "catcherAllowFiles" ) );
				try {
					conf.put( "fieldName", this.jsonConfig.getString( "catcherFieldName" ) + "[]" );
				} catch (JSONException e) {
					e.printStackTrace();
				}
				try {
					savePath = this.jsonConfig.getString( "catcherPathFormat" );
				} catch (JSONException e) {
					e.printStackTrace();
				}
				break;
				
			case ActionMap.LIST_IMAGE:
				conf.put( "allowFiles", this.getArray( "imageManagerAllowFiles" ) );
				try {
					conf.put( "dir", this.jsonConfig.getString( "imageManagerListPath" ) );
				} catch (JSONException e) {
					e.printStackTrace();
				}
				try {
					conf.put( "count", this.jsonConfig.getInt( "imageManagerListSize" ) );
				} catch (JSONException e) {
					e.printStackTrace();
				}
				break;
				
			case ActionMap.LIST_FILE:
				conf.put( "allowFiles", this.getArray( "fileManagerAllowFiles" ) );
				try {
					conf.put( "dir", this.jsonConfig.getString( "fileManagerListPath" ) );
				} catch (JSONException e) {
					e.printStackTrace();
				}
				try {
					conf.put( "count", this.jsonConfig.getInt( "fileManagerListSize" ) );
				} catch (JSONException e) {
					e.printStackTrace();
				}
				break;
				
		}
		
		conf.put( "savePath", savePath );
		conf.put( "rootPath", this.rootPath );
		
		return conf;
		
	}
	
	private void initEnv () throws FileNotFoundException, IOException {
		
		File file = new File( this.originalPath );
		
		if ( !file.isAbsolute() ) {
			file = new File( file.getAbsolutePath() );
		}
		
		this.parentPath = file.getParent();
		
		String configContent = this.readFile( this.getConfigPath() );
		
		try{
			JSONObject jsonConfig = new JSONObject( configContent );
			this.jsonConfig = jsonConfig;
		} catch ( Exception e ) {
			this.jsonConfig = null;
		}
		
	}
	
	private String getConfigPath () {
//		return this.parentPath + File.separator + ConfigManager.configFileName;
		try {
			//获取classpath下的config.json路径
			return this.getClass().getClassLoader().getResource("config.json").toURI().getPath();
		} catch (URISyntaxException e) {
			return null;
		}
	}

	private String[] getArray ( String key ) {

		JSONArray jsonArray = null;
		try {
			jsonArray = this.jsonConfig.getJSONArray( key );
		} catch (JSONException e) {
			e.printStackTrace();
		}
		String[] result = new String[ jsonArray.length() ];
		
		for ( int i = 0, len = jsonArray.length(); i < len; i++ ) {
			try {
				result[i] = jsonArray.getString( i );
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		
		return result;
		
	}
	
	private String readFile ( String path ) throws IOException {
		
		StringBuilder builder = new StringBuilder();
		
		try {
			
			InputStreamReader reader = new InputStreamReader( new FileInputStream( path ), "UTF-8" );
			BufferedReader bfReader = new BufferedReader( reader );
			
			String tmpContent = null;
			
			while ( ( tmpContent = bfReader.readLine() ) != null ) {
				builder.append( tmpContent );
			}
			
			bfReader.close();
			
		} catch ( UnsupportedEncodingException e ) {
			// 忽略
		}
		
		return this.filter( builder.toString() );
		
	}
	
	// 过滤输入字符串, 剔除多行注释以及替换掉反斜杠
	private String filter ( String input ) {
		
		return input.replaceAll( "/\\*[\\s\\S]*?\\*/", "" );
		
	}
	
}
