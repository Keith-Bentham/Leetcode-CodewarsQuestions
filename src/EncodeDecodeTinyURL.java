import java.util.HashMap;

/**
 * Created by Keith Bentham
 */
public class EncodeDecodeTinyURL {
    HashMap<String, String> map = new HashMap<String, String>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        map.put(Integer.toString(map.size()), longUrl);
        return Integer.toString(map.size() - 1);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(String.valueOf(shortUrl));
    }
}