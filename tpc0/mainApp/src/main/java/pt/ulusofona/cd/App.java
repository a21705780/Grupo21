package pt.ulusofona.cd;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	for (int i=0; i<args.length;i++){
			System.out.println(args[i]);
		}


    	System.out.println();System.out.println();System.out.println();


    	System.out.println( "Hello World!" );
    	System.out.println();

    	int index = 0;
    	for (String arg : args) {
			System.out.println("ARG nr: " +index + " -> " + arg);
    		index++;
		}
    	System.out.println();System.out.println();

   	 	// This code has a dependency on "ConfigHelper" module

     	ConfigHelper configHelper = new ConfigHelper();
    	String min = configHelper.getConfigValue("min");
    	System.out.println("Configured Min: " + min);
    	configHelper.printSomeProperties();
    	System.out.println();System.out.println();System.out.println();

    }
}