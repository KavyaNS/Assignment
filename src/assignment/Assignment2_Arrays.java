package assignment;

public class Assignment2_Arrays {

	public static void main(String[] args) {
		String [][][] Semester_data = {
				{//Sem 1
					//subjects and marks
					{"Mathematics I","Physics","Chemistry","Computer Programming","Engineering Drawing","Basic Electrical Eng."},
					{"78","85","91","74","88","79"}
				},
				{//Sem 2
					//subjects and marks
					{"Mathematics II","Mechanics","Environmental Sci.","Basic Electronics","Engineering Physics","Engineering Graphics"},
					{"82","77","93","69","84","90"}
				},	
				{//Sem 3
					//subjects and marks
					{"Data Structures","Discrete Mathematics","Digital Electronics","Operating Systems","Signals and Sytems","Object-Oriented Prog."},
					{"88","81","76","92","85","78"}
				},
				{//Sem 4
					//subjects and marks
					{"Algorithms","Computer Networks","Database Systems","Microprocessors","Communication Eng.","Software Engineering"},
					{"91","73","89","80","76","87"}
				},
				{//Sem 5
					//subjects and marks
					{"Probability & Stats","Machine Learnings","Compiler Design","Theory of Computation","Embedded Systems","Computer Graphics"},
					{"86","88","84","95","73","90"}
				}
		};
		System.out.println("Semester 3 - Subject 4 and Subject 5 Names are "+Semester_data[2][0][3]+" and "+Semester_data[2][0][4]);
		System.out.println("Semester 5 - Subject 3 and Subject 6 marks are "+Semester_data[4][1][2]+" and "+Semester_data[4][1][5]);

	}

}
