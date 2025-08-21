package codes;

//Code gas station

/*There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.

Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique.*/

public class Code134 {

	public static void main(String[] args) {
		int gas[] = {1,2,3,4,5};
		int cost[]= {3,4,5,1,2};
		
		int result = canCompleteCircuit(gas, cost);
		System.out.println(result);
	}
	
	public static int canCompleteCircuit(int gas[], int cost[]) {
		int totalGas=0;
		int totalCost=0;
		
		for(int i=0; i<gas.length; i++) {
			totalGas=totalGas+gas[i];
			totalCost=totalCost+cost[i];
		}
		
		if(totalGas<totalCost) {
			return -1;
		}
		
		int start=0;
		int currentGas=0;
		
		for(int i=0; i<gas.length; i++) {
			currentGas=currentGas+(gas[i]-cost[i]);
			if(currentGas<0) {
				start=i+1;
				currentGas=0;
			}
		}
		return start;
	}

}
