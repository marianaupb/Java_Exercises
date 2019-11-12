class Timer {
	private int seconds;
	private int minutes;

	public Timer() {
		this.seconds = 0;
		this.minutes = 0;
	}

	public void addSeconds(int seconds) {
		if (seconds < 0 || seconds > 59)	{
			return;
		}
		this.seconds += seconds;
		if (this.seconds > 59)	{
			this.seconds = 59;
		}
	}
	public void addMinutes(int minutes) {
		if (this.seconds > 59)	{
			if (this.minutes == 59)	{
				this.minutes -= minutes;
			}
			addMinutes(1);
			this.minutes -= 59;
		}
	}

	public void reset() {
		this.seconds = 0;
	}
}
