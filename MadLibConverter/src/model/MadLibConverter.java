package model;

public class MadLibConverter 
{
	// Create all the instance variables needed.
	private String madLibStory;
	private String madLibStory2;
	private String color;
	private String superlative;
	private String firstAdj;
	private String pluralBodyPart;
	private String bodyPart;
	private String noun;
	private String pluralAnimal;
	private String secondAdj;
	private String thirdAdj;
	private String fourthAdj;
	private String fifthAdj;
	private String secondNoun;
	private String animal;
	private String noise;
	
	// Default constructor.
	public MadLibConverter()
	{
		super();
	}
	
	// Constructor for the first story created.
	public MadLibConverter(String color, String superlative, String firstAdj, String pluralBodyPart, String bodyPart, String noun,
						   String pluralAnimal, String secondAdj, String thirdAdj, String fourthAdj)
	{
		super();
		// Set all the variables so they will become upper case, lower case, etc.
		setColor(color);
		setSuperlative(superlative);
		setFirstAdj(firstAdj);
		setPluralBodyPart(pluralBodyPart);
		setBodyPart(bodyPart);
		setNoun(noun);
		setPluralAnimal(pluralAnimal);
		setSecondAdj(secondAdj);
		setThirdAdj(thirdAdj);
		setFourthAdj(fourthAdj);
		
		// Create the story.
		createMadLibStory();
	}
	
	// Constructor for the second story created.
	public MadLibConverter(String fifthAdj, String secondNoun, String animal, String noise)
	{
		super();
		// Set all the variables so they will become upper case, lower case, etc.
		setFifthAdj(fifthAdj);
		setSecondNoun(secondNoun);
		setAnimal(animal);
		setNoise(noise);
		
		// Create the story.
		createMadLibStory2();
	}
	
	// Getters and setters.
	public String getMadLibStory() 
	{
		// If statement checking for when the toString will use this variable. If it is null just set it to a blank character.
		if (madLibStory == null)
		{
			madLibStory = "";
		}
		
		return madLibStory;
	}
	public void setMadLibStory(String madLibStory)
	{
		this.madLibStory = madLibStory;
	}
	
	public String getMadLibStory2() 
	{
		// If statement checking for when the toString will use this variable. If it is null just set it to a blank character.
		if (madLibStory2 == null)
		{
			madLibStory2 = "";
		}
		
		return madLibStory2;
	}
	public void setMadLibStory2(String madLibStory2)
	{
		this.madLibStory2 = madLibStory2;
	}
	
	
	public String getColor() 
	{
		return color;
	}
	public void setColor(String color) 
	{
		// Create two strings to hold the substrings.
		String firstLetter;
		String restOfTheLetters;
		
		// Create substrings.
		firstLetter = color.substring(0, 1);
		restOfTheLetters = color.substring(1);
		// Set the color to the newly created substrings with upper or lower case letters.
		this.color = firstLetter.toUpperCase() + restOfTheLetters.toLowerCase();
	}

	public String getSuperlative() 
	{
		return superlative;
	}
	public void setSuperlative(String superlative) 
	{
		this.superlative = superlative.toUpperCase();
	}

	public String getFirstAdj()
	{
		return firstAdj;
	}
	public void setFirstAdj(String firstAdj) 
	{
		this.firstAdj = firstAdj.toLowerCase();
	}
	
	public String getPluralBodyPart() 
	{
		return pluralBodyPart;
	}
	public void setPluralBodyPart(String pluralBodyPart) 
	{
		this.pluralBodyPart = pluralBodyPart.toLowerCase();
	}

	public String getBodyPart() 
	{
		return bodyPart;
	}
	public void setBodyPart(String bodyPart) 
	{
		this.bodyPart = bodyPart.toLowerCase();
	}

	public String getNoun() 
	{
		return noun;
	}
	public void setNoun(String noun) 
	{
		this.noun = noun.toLowerCase();
	}

	public String getPluralAnimal() 
	{
		return pluralAnimal;
	}
	public void setPluralAnimal(String pluralAnimal) 
	{
		this.pluralAnimal = pluralAnimal.toLowerCase();
	}

	public String getSecondAdj() 
	{
		return secondAdj;
	}
	public void setSecondAdj(String secondAdj) 
	{
		this.secondAdj = secondAdj.toLowerCase();
	}

	public String getThirdAdj() 
	{
		return thirdAdj;
	}
	public void setThirdAdj(String thirdAdj) 
	{
		this.thirdAdj = thirdAdj.toLowerCase();
	}

	public String getFourthAdj() 
	{
		return fourthAdj;
	}
	public void setFourthAdj(String fourthAdj) 
	{
		this.fourthAdj = fourthAdj.toLowerCase();
	}

	public String getFifthAdj() 
	{
		return fifthAdj;
	}
	public void setFifthAdj(String fifthAdj) 
	{
		// Create two string to hold the substrings.
		String firstLetter;
		String restOfTheLetters;
		
		// Create substrings.
		firstLetter = fifthAdj.substring(0, 1);
		restOfTheLetters = fifthAdj.substring(1);
		
		// Set the fifthAdj to the newly created substrings with upper or lower case letters.
		this.fifthAdj = firstLetter.toUpperCase() + restOfTheLetters.toLowerCase();
	}

	public String getSecondNoun() 
	{
		return secondNoun;
	}
	public void setSecondNoun(String secondNoun) 
	{
		this.secondNoun = secondNoun.toLowerCase();
	}

	public String getAnimal() 
	{
		return animal;
	}
	public void setAnimal(String animal) 
	{
		this.animal = animal.toLowerCase();
	}

	public String getNoise() 
	{
		return noise;
	}
	public void setNoise(String noise) 
	{
		this.noise = noise.toUpperCase();
	}

	// Create the first story.
	public void createMadLibStory ()
	{
		// Use get statements while creating the story to allow each variable to be upper or lower case.
		String madLibStory = "The " + getColor() + " Dragon is the " + getSuperlative() + " Dragon of all. It has " 
		+ getFirstAdj() + " " + getPluralBodyPart() + ", and a " + getBodyPart() + " shaped like a "
		+ getNoun() + ". It loves to eat " + getPluralAnimal() + ", although it will feast" + 
		" on nearly anything. It is " + getSecondAdj() + " and " + getThirdAdj() + ". You must be " 
		+ getFourthAdj() + " around it, or you may end up as it`s meal!"; 
		
		// Set the story's string.
		setMadLibStory(madLibStory);
	}
	
	// Create the second story.
	public void createMadLibStory2()
	{
		// Use get statements while creating the story to allow each variable to be upper or lower case.
		String madLibStory2 = getFifthAdj() + " Macdonald had a " + getSecondNoun() + ", E-I-E-I-Oand on that " + getSecondNoun() 
		+ " he had an " + getAnimal() + ", E-I-E-I-O with a " + getNoise() + " " + getNoise() + " here and a " + getNoise() + " " + getNoise()
		+ " there,here a " + getNoise() + ", there a " + getNoise() + ", everywhere a " + getNoise() + " " + getNoise() + "," + getFifthAdj()
		+ " Macdonald had a " + getSecondNoun() + ", E-I-E-I-O.";
		
		// Set the story's string.
		setMadLibStory2(madLibStory2);
	}
	
	@Override
	public String toString() 
	{
		return getMadLibStory() + getMadLibStory2();
	}
}