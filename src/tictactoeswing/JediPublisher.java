package tictactoeswing;

import java.util.Scanner;
import redis.clients.jedis.Jedis;

public class JediPublisher {
    private String servidor = "localhost";
    private Jedis jedis;
    public JediPublisher() {
        setupPublisher();
    }
    
    public void postar(String topico, String msg){
        jedis.publish(topico, msg);
        //jedis.quit();
    }
    
    
    public void setupPublisher(){
        jedis = new Jedis(servidor);
    }
}
