package InterviewPreparationKit.dictionariesAndHashmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCount {


    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        List<Integer> result = new ArrayList<Integer>();

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (List<Integer> querie : queries) {
			if (querie.size() == 2) {
				int q = querie.get(0);
				int val = querie.get(1);
				if (q == 1) {
					if (map.containsKey(val)) {
						map.put(val, map.get(val) + 1);
					} else {
						map.put(val, 1);
					}

				} else if (q == 2) {
					if (map.containsKey(val)) {
						map.put(val, map.get(val) - 1);
					}
				} else if (q == 3) {

					Boolean flag = true;
					for (Integer k : map.keySet()) {
						if (map.get(k) == val) {
							result.add(1);
							flag = false;
							break;
						}
					}
					if (flag) {
						result.add(0);
					}
				}

			}
		}
       
        return result;

    }

    public static void main(String[] args) {

        List<List<Integer>> queries = new ArrayList<>();

       
       
        List<Integer> list1 = Arrays.asList(1,3);
        queries.add(list1);
       
        List<Integer> list2 = Arrays.asList(2,3);
        queries.add(list2);
       
        List<Integer> list3 = Arrays.asList(3,2);
        queries.add(list3);
       
        List<Integer> list4 = Arrays.asList(1,4);
        queries.add(list4);
       
        List<Integer> list5 = Arrays.asList(1,5);
        queries.add(list5);
       
        List<Integer> list6 = Arrays.asList(1,5);
        queries.add(list6);
       
        List<Integer> list7 = Arrays.asList(1,4);
        queries.add(list7);
       
        List<Integer> list8 = Arrays.asList(3,2);
        queries.add(list8);
       
        List<Integer> list9 = Arrays.asList(2,4);
        queries.add(list9);
       
        List<Integer> list10 = Arrays.asList(3,2);
        queries.add(list10);
       
        List<Integer> ans = freqQuery(queries);

       System.out.println(ans.toString());
    }
}
