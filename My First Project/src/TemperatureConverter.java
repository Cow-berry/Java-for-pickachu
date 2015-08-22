
public class TemperatureConverter 
{
	public static String convertTemp
		(double temperature, char convertTo)
	{
		if (convertTo == 'C')
		{
			temperature = (temperature - 32) * 0.55;
		}
		else if (convertTo == 'F')
		{
			temperature = temperature / 0.55 + 32;
		}
		else
		{
			return "Вы ввели шкалу не соответствующую шкалам этой программы. Введите C (градусы Цельсия) или F (градусы Фарингейтa).";
		}
		return "Конвертированная температура --- " + temperature + convertTo;
	}
	public static void main (String[] args)
	{
		System.out.println( TemperatureConverter.convertTemp(-273, 'C'));
	} 
}
