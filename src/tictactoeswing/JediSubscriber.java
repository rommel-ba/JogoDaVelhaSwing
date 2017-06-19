package tictactoeswing;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

public class JediSubscriber {
    
    private String msg;
    private String servidor = "localhost";
    private String status = "";
    
    public JedisPubSub setupSubscriber(){
        JedisPubSub jedisPubSub = new JedisPubSub() {
            @Override
            public void onMessage(String channel, String message) {
                super.onMessage(channel, message);
                msg = message;
                System.out.println(msg);
                if(status.equals("sair"))
                    System.exit(0);
            }
        };
        new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Jedis jedis = new Jedis(servidor);
					jedis.subscribe(jedisPubSub, "canal");
					jedis.quit();
				} catch (Exception e) {
					 e.printStackTrace();
				}
			}
		}, "subscriberThread").start();
        return jedisPubSub;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
