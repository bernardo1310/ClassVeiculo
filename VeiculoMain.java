
public class VeiculoMain {
	public static void main(String[] args) {
		Veiculo vei = new Veiculo();
		vei.setMotor(true);
		System.out.println(vei);
		
		Caminhao cam = new Caminhao();
		cam.setEixos(4);
		cam.setMotor(true);
		System.out.println(cam);
		
		Carro car = new Carro();
		car.setPortas(4);
		car.setMotor(true);
		System.out.println(car);
		
		Moto mt = new Moto();
		mt.setCilindradas(100);
		mt.setMotor(true);
		System.out.println(mt);
	}
}
