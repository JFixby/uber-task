
package Uber1;

import com.jfixby.hrank.HackerRankSimulator;
import com.jfixby.scarabei.api.desktop.ScarabeiDesktop;

public class RunSimulation {

	public static void main (final String[] args) throws Throwable {
		ScarabeiDesktop.deploy();
		HackerRankSimulator.run(Solution.class);
	}

}
