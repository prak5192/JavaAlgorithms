package InterviewPreparationKit.dictionariesAndHashmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCountApproach2 {


    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
		List<Integer> res = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		HashMap<Integer, Integer> fmap = new HashMap<>();
		for (int i = 0; i < queries.size(); i++) {
			if (queries.get(i).get(0) == 1) {
				int freq = map.getOrDefault(queries.get(i).get(1), 0);
				map.put(queries.get(i).get(1), map.getOrDefault(queries.get(i).get(1), 0) + 1);
				if (freq != 0) {
					if (fmap.get(freq) == 1)
						fmap.remove(freq);
					else
						fmap.put(freq, fmap.get(freq) - 1);
				}
				fmap.put(freq + 1, fmap.getOrDefault(freq + 1, 0) + 1);

			}
			if (queries.get(i).get(0) == 2) {

				if (map.containsKey(queries.get(i).get(1))) {
					int freq = map.get(queries.get(i).get(1));
					if (freq == 1)
						map.remove(queries.get(i).get(1));
					else
						map.put(queries.get(i).get(1), map.get(queries.get(i).get(1)) - 1);
					if (fmap.get(freq) == 1)
						fmap.remove(freq);
					else
						fmap.put(freq, fmap.get(freq) - 1);
					if (freq != 1)
						fmap.put(freq - 1, fmap.getOrDefault(freq - 1, 0) + 1);
				}

			}
			if (queries.get(i).get(0) == 3) {
				if (fmap.containsKey(queries.get(i).get(1)) && queries.get(i).get(1) != 0) {
					res.add(1);
				} else {
					res.add(0);
				}

			}
		}
		return res;

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
