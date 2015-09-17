import java.io.File;
import java.io.IOException;



public class Main
{

	public static void main( String[] args ) throws IOException
	{
		File classFolder = new File( "src\\liblinear" );
		File[] listofFiles = classFolder.listFiles();

		for ( File file : listofFiles )
		{
			if ( file.getName().contains( "java" ) )
				System.out.println( file.getName() );
		}
		/*
		 * String[] param = new String[ 4 ];
		 * param[ 0 ] = "-b";
		 * param[ 1 ] = "1";
		 * param[ 2 ] = "-q";
		 * param[ 3 ] = "Data\\tmp_train";
		 * svm_train.main( param );
		 * 
		 * param = new String[ 3 ];
		 * param[ 0 ] = "Data\\tmp_test";
		 * param[ 1 ] = "Data\\tmp_train.model";
		 * param[ 2 ] = "Data\\tmp_train.output";
		 * svm_predict.main( param );
		 */

		Classifier classifier = new Classifier();
		/*
		 * classifier.buildTrainData();
		 * classifier.buildTestFile();
		 */
	}
}
