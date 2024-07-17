package model;

public class Servidor {
	private static Servidor server;
	private static String ip;
	private static String url;
	
	/**
	 * Constructor privado
	 */
	private Servidor(){
		
	}
	
	/**
	 * Metodo get del atributo Server
	 * @return retorna el servidor inicializado
	 */
	public static Servidor getServer() {
		if(Servidor.server == null) {
			server = new Servidor();
			server.ip = "localhost";
			server.url = "localhost/databaseName";
		}
		return Servidor.server;
	}
	
	public static String getIp() {
		return ip;
	}
	
	public static String getUrl() {
		return url;
	}
	
	

}
