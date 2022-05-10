package exe;

import entity.BuildingWork;
import entity.OutsourceCompany;
import service.BuildingWorkService;

public class Main {
	

	public static void main(String[] args) {

	
	BuildingWorkService genericS = new BuildingWorkService();
	OutsourceCompany o = new OutsourceCompany("Huelva construcciones","g-123456",100000000);
	BuildingWork b = new BuildingWork();
	OutsourceCompany o1 = new OutsourceCompany("Cordoba construcciones","j-123456",500000000);
	o.setBuildingWork(b);
	o1.setBuildingWork(b);

	b.getOc().add(o);
	b.getOc().add(o1);
	
	
	//BuildingWork b1 = new BuildingWork();
	
	//genericS.save(o);
	//genericS.save(o1);
	genericS.save(b);
}
}