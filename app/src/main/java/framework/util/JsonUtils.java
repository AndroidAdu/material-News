package framework.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.util.Date;

/**
 * json 解析工具类
 * 
 * @author duxue
 *
 */
public class JsonUtils {
	
	private static Gson gson;
	
	/**
	 * 用于解决 new gson() 解析日期解析不出来的问题  
	 * 用于解决gson解析  Date 日期出问题的办法
	 * @return
	 */
	public static Gson getGson() {
		if(gson==null){
			GsonBuilder builder = new GsonBuilder();
			builder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
				public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
						throws JsonParseException {
					return new Date(json.getAsJsonPrimitive().getAsLong());
				}
			});
			builder.registerTypeAdapter(Date.class, new JsonSerializer<Date>() {
				@Override
				public JsonElement serialize(Date date, Type typeOfT, JsonSerializationContext context) {
					return new JsonPrimitive(date.getTime());
				}
			});
			
			gson=builder.create();
		}
		return gson;
	}
	
	
	/**
	 * 解析实体类
	 * @param jsonString
	 * @param t
	 * @return
	 */
	public static <T> T fromJsonToEntity(String jsonString, Class<T> t) {
		try {
			return getGson().fromJson(jsonString, t);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	/**
	 * 将json 对象转化为String 
	 * 
	 */
	
	public static String fromEntityToString(Object object){
		
		return getGson().toJson(object);
	}
	
}
