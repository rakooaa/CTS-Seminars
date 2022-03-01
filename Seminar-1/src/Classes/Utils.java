package Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Utils {
	static int aparatii(Integer[] parametrii) {
		List<Integer> list = Arrays.asList(parametrii);
		Collections.sort(list);
		int minim = list.get(0);
		return minim;	
	}
}
