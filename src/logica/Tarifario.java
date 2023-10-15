package logica;

public  class Tarifario {
	private int idTarifa;
	private static double tarifaDia ;
	private static double aumentoTemporada;
	private static double valorExtraOtraSede;
	private static double valorExtra2Conduc;
	public int getIdTarifa() {
		return idTarifa;
	}
	public void setIdTarifa(int idTarifa) {
		this.idTarifa = idTarifa;
	}
	public static double getTarifaDia() {
		return tarifaDia;
	}
	public static void setTarifaDia(double tarifaDia) {
		Tarifario.tarifaDia = tarifaDia;
	}
	public static double getAumentoTemporada() {
		return aumentoTemporada;
	}
	public static void setAumentoTemporada(double aumentoTemporada) {
		Tarifario.aumentoTemporada = aumentoTemporada;
	}
	public static double getValorExtraOtraSede() {
		return valorExtraOtraSede;
	}
	public static void setValorExtraOtraSede(double valorExtraOtraSede) {
		Tarifario.valorExtraOtraSede = valorExtraOtraSede;
	}
	public static double getValorExtra2Conduc() {
		return valorExtra2Conduc;
	}
	public static void setValorExtra2Conduc(double valorExtra2Conduc) {
		Tarifario.valorExtra2Conduc = valorExtra2Conduc;
	}
	
	// Funcion que revisa si esta en temporada alta o temporada baja
}
