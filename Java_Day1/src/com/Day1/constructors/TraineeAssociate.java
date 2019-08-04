package com.Day1.constructors;

public class TraineeAssociate {

	int traineeId;
	String traineeName;
	String trainedOn;
	String trainingLocation;
	String prefferedLocation;
	String deployedLocation;

	/**
	 * @param traineeId
	 * @param traineeName
	 * @param trainedOn
	 * @param trainingLocation
	 * @param prefferedLocation
	 * @param deployedLocation
	 */
	public TraineeAssociate(int traineeId, String traineeName, String trainedOn, String trainingLocation,
			String prefferedLocation, String deployedLocation) {

		System.out.println("All Para Constructor");
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.trainedOn = trainedOn;
		this.trainingLocation = trainingLocation;
		this.prefferedLocation = prefferedLocation;
		this.deployedLocation = deployedLocation;
	}

	public TraineeAssociate() {
		System.out.println("Default Constructor");
		prefferedLocation = "California";
		deployedLocation = "New York";
	}

	/**
	 * @param traineeId
	 * @param traineeName
	 * @param trainedOn
	 * @param trainingLocation
	 */
	public TraineeAssociate(int traineeId, String traineeName, String trainedOn, String trainingLocation) {

		// CaLLING ONE CONSTRUCTOR INSIDE ONE MORE CONSTRUCTOR OF SAME CLASS then we can
		// use this at constructor level

		this();// this at constructor level
		System.out.println("4 Para Constructor");
		this.traineeId = traineeId;// this at variable level
		this.traineeName = traineeName;
		this.trainedOn = trainedOn;
		this.trainingLocation = trainingLocation;
	}

	@Override
	public String toString() {
		return "TraineeAssociate [traineeId=" + traineeId + ", traineeName=" + traineeName + ", trainedOn=" + trainedOn
				+ ", trainingLocation=" + trainingLocation + ", prefferedLocation=" + prefferedLocation
				+ ", deployedLocation=" + deployedLocation + "]";
	}

}
