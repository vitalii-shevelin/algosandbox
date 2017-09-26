import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ChessboardPattern {
	
	public String[] makeChessboard(int rows, int columns) {
		String a = ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X"
				.substring(0, columns);
		String b = "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X."
				.substring(0, columns);

		String[] result = new String[rows];
		for(int r = rows-1; r >=0; r-- ) {
			result[r] =((rows-r) % 2 == 1) ? a : b;
		}

		return result;
	}
}
