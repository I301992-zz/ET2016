package springcorepackage;

import java.util.List;

public class IndianTiger{
	private List<String> Namelist;
	public void eat()
	{
		System.out.println("Within Indian Tiger's eat function");
	}
	public List<String> getNamelist() {
		return Namelist;
	}
	public void setNamelist(List<String> namelist) {
		Namelist = namelist;
	}


}
