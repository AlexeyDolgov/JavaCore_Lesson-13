package ua.lviv.lgs.task13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public final class SupremeCouncil {

	private static SupremeCouncil instance = new SupremeCouncil();

	private SupremeCouncil() {
	}

	public static SupremeCouncil getInstance() {
		if (instance == null) {
			instance = new SupremeCouncil();
		}

		return instance;
	}

	
	ArrayList<DeputyGroup> supremeCouncilArray = new ArrayList<DeputyGroup>();

	public void addDeputyGroup() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите название фракции:");
		String deputyGroupName = scanner.next();

		DeputyGroup deputyGroup = new DeputyGroup(deputyGroupName);

		supremeCouncilArray.add(deputyGroup);
		System.out.println(deputyGroup.toString() + " успешно добавлена в Верховну Раду!");
	}

	public void removeDeputyGroup() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите название фракции:");
		String deputyGroupName = scanner.next();

		boolean typeCorrect = isDeputyGroupExists(supremeCouncilArray, deputyGroupName);

		if (typeCorrect) {

			Iterator<DeputyGroup> iterator = supremeCouncilArray.iterator();

			while (iterator.hasNext()) {
				DeputyGroup nextDeputyGroup = iterator.next();

				if (nextDeputyGroup.getDeputyGroupName().equalsIgnoreCase(deputyGroupName)) {
					iterator.remove();
					System.out.println(nextDeputyGroup.toString() + " успешно удалена из Верховной Рады!");
				}
			}

		} else {
			System.out.println("Введенной фракции в Верховной Раде нет!");
		}
	}

	public void getAllDeputyGroups() {
		System.out.println("Фракции, зарегистрированные в Верхоной Раде:");
		for (DeputyGroup deputyGroup : supremeCouncilArray) {
			System.out.println(deputyGroup.toString());
		}
	}

	public void clearDeputyGroup() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите название фракции:");
		String deputyGroupName = scanner.next();

		boolean typeCorrect = isDeputyGroupExists(supremeCouncilArray, deputyGroupName);

		if (typeCorrect) {
			for (DeputyGroup deputyGroup : supremeCouncilArray) {
				if (deputyGroup.getDeputyGroupName().equalsIgnoreCase(deputyGroupName)) {
					deputyGroup.clearDeputyGroup();
				}
			}

		} else {
			System.out.println("Введенной фракции в Верховной Раде нет!");
		}
	}

	public void getDeputyGroup() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите название фракции:");
		String deputyGroupName = scanner.next();

		for (DeputyGroup deputyGroup : supremeCouncilArray) {
			if (deputyGroup.getDeputyGroupName().equalsIgnoreCase(deputyGroupName)) {
				System.out.println(deputyGroup.toString());
				deputyGroup.getAllDeputies();
			}
		}
	}

	public void addDeputyToDeputyGroup() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите название фракции:");
		String deputyGroupName = scanner.next();

		boolean typeCorrect = isDeputyGroupExists(supremeCouncilArray, deputyGroupName);

		if (typeCorrect) {
			for (DeputyGroup deputyGroup : supremeCouncilArray) {
				if (deputyGroup.getDeputyGroupName().equalsIgnoreCase(deputyGroupName)) {
					deputyGroup.addDeputy();
				}
			}

		} else {
			System.out.println("Введенной фракции в Верховной Раде нет!");
		}
	}
	
	public void removeDeputyFromDeputyGroup() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите название фракции:");
		String deputyGroupName = scanner.next();

		boolean typeCorrect = isDeputyGroupExists(supremeCouncilArray, deputyGroupName);

		if (typeCorrect) {
			for (DeputyGroup deputyGroup : supremeCouncilArray) {
				if (deputyGroup.getDeputyGroupName().equalsIgnoreCase(deputyGroupName)) {
					deputyGroup.removeDeputy();
				}
			}

		} else {
			System.out.println("Введенной фракции в Верховной Раде нет!");
		}
	}
	
	public void getBribeTakersFromDeputyGroup() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите название фракции:");
		String deputyGroupName = scanner.next();

		boolean typeCorrect = isDeputyGroupExists(supremeCouncilArray, deputyGroupName);

		if (typeCorrect) {
			for (DeputyGroup deputyGroup : supremeCouncilArray) {
				if (deputyGroup.getDeputyGroupName().equalsIgnoreCase(deputyGroupName)) {
					deputyGroup.getBribeTakers();
				}
			}

		} else {
			System.out.println("Введенной фракции в Верховной Раде нет!");
		}
	}
	
	public void getLargestBribeTakerFromDeputyGroup() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите название фракции:");
		String deputyGroupName = scanner.next();

		boolean typeCorrect = isDeputyGroupExists(supremeCouncilArray, deputyGroupName);

		if (typeCorrect) {
			for (DeputyGroup deputyGroup : supremeCouncilArray) {
				if (deputyGroup.getDeputyGroupName().equalsIgnoreCase(deputyGroupName)) {
					deputyGroup.getLargestBribeTaker();
				}
			}

		} else {
			System.out.println("Введенной фракции в Верховной Раде нет!");
		}
	}
	
	public void getAllDeputiesFromDeputyGroup() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите название фракции:");
		String deputyGroupName = scanner.next();

		boolean typeCorrect = isDeputyGroupExists(supremeCouncilArray, deputyGroupName);

		if (typeCorrect) {
			for (DeputyGroup deputyGroup : supremeCouncilArray) {
				if (deputyGroup.getDeputyGroupName().equalsIgnoreCase(deputyGroupName)) {
					deputyGroup.getAllDeputies();;
				}
			}

		} else {
			System.out.println("Введенной фракции в Верховной Раде нет!");
		}
	}
	
	static boolean isDeputyGroupExists(ArrayList<DeputyGroup> supremeCouncilArray, String deputyGroupName) {
		boolean flag = false;

		for (DeputyGroup deputyGroup : supremeCouncilArray) {
			if (deputyGroup.getDeputyGroupName().equalsIgnoreCase(deputyGroupName)) {
				flag = true;
			}
		}

		return flag;
	}

}
