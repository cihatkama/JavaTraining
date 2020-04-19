package forecast;

public class Weather {

	private static boolean heatWave = true;

	public static void main() {
		boolean heatWave = false;
		System.out.println("Local heatWave : " + heatWave);

		System.out.println("Instance heatWave : " + Weather.heatWave);

	}

}
