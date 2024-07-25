package apps;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	public void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}	
}