package numberseries.findnextnumberinseries.entity;

public class nextnumDetails {

		Double nextNum;
		String nameOfSeries;
		String logicalFlow;
		Double additionalNumber1;
		Double additionalNumber2;
		
		
		public nextnumDetails(Double nextNum, String nameOfSeries, String logicalFlow, Double additionalNumber1,
				Double additionalNumber2) {
			this.nextNum = nextNum;
			this.nameOfSeries = nameOfSeries;
			this.logicalFlow = logicalFlow;
			this.additionalNumber1 = additionalNumber1;
			this.additionalNumber2 = additionalNumber2;
		}


		public Double getNextNum() {
			return nextNum;
		}
		public void setNextNum(Double nextNum) {
			this.nextNum = nextNum;
		}
		public String getNameOfSeries() {
			return nameOfSeries;
		}
		public void setNameOfSeries(String nameOfSeries) {
			this.nameOfSeries = nameOfSeries;
		}
		public String getLogicalFlow() {
			return logicalFlow;
		}
		public void setLogicalFlow(String logicalFlow) {
			this.logicalFlow = logicalFlow;
		}
		public Double getAdditionalNumber1() {
			return additionalNumber1;
		}

		public void setAdditionalNumber1(Double additionalNumber1) {
			this.additionalNumber1 = additionalNumber1;
		}

		public Double getAdditionalNumber2() {
			return additionalNumber2;
		}

		public void setAdditionalNumber2(Double additionalNumber2) {
			this.additionalNumber2 = additionalNumber2;
		}

	}
