package task1;

public class MusicSystem {
	private boolean button;

	
	
	public boolean isButton() {
		return button;
	}

	public void setButton(boolean button) {
		this.button = button;
	}

	public MusicSystem(boolean button) {
		
		this.button = button;
	}

	public String startmusicplayer(boolean button)
	{
		if(button)
		{
			String a="on";
			return a;
		}
		else
		{
			
			 String b="off";
			return b;
		}
			
		
	}

}
