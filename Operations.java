package com.transaction;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Operations {

	public void display(List<TransactionDetails> tranDetails) {
		Map<String, Double> transmap = new TreeMap<>();
		tranDetails.stream().filter(td -> td.getType().equalsIgnoreCase("CREDIT")).map(td -> {
			if (transmap.containsKey(td.getSource())) {
				transmap.put(td.getSource(), td.getAmount() + transmap.get(td.getSource()));
			} else {
				transmap.put(td.getSource(), td.getAmount());
			}
			return transmap;
		}).collect(Collectors.toList());
		transmap.forEach((source, amount)->System.out.println(source+amount));
	}

}
