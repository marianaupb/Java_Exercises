class TimePeriod {
	private int hours;
	private int minutes;

	public TimePeriod() {
		this.hours = 0;
		this.minutes = 0;
	}	

	public void addHours(int hours) {
		if (hours < 0 || hours > 99) {
			return;
		}
		this.hours += hours;

		if (this.hours > 99) {
			this.hours = 99;
		}
	}

	public void addMinutes(int minutes) {
		if (minutes < 0 || minutes > 59) {
			return;
		}
		this.minutes += minutes;

		if (this.minutes > 59) {
			if (this.hours == 99) {
				this.minutes -= minutes;
				return;
			}
			addHours(1);
			this.minutes -= 60;
		}
	}

	public String toString() {
		return this.hours + " h " + this.minutes + " min";
	}
}
