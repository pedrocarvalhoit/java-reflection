package aluratorPlayground.playground.reflexao;

import aluratorPlayground.playground.controle.Controle;

public class TesteInstanciaObjeto {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
			Class<Controle> controleClasse1 = Controle.class;
			
			Controle controle = new Controle();
			Class<? extends Controle> controleClasse2 = controle.getClass();
			
			Class<?> controleClasse3 = Class.forName("aluratorPlayground.playground.controle.Controle");
			
			Object objetoControle = controleClasse1.newInstance();
			
			System.out.println(objetoControle instanceof Controle);

	}

}
