import java.awt.Desktop;
import java.io.IOException;
import java.lang.invoke.LambdaConversionException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;

public class Main {
	
	
	
	public static String prefix = "< ";	
	public static Langauges currentLangauge = Langauges.ENGLISH;
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		 try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("   __    _         __  __  __  __     ___    ___  _____   _               _       _                   \r\n" + 
				"   \\ \\  /_\\    /\\ /\\ \\/ / /__\\/ _\\   / __\\  /___\\/__   \\ | |__  _   _    (_) __ _| | ____  _____  ___ \r\n" + 
				"    \\ \\//_\\\\  / //_/\\  / /_\\  \\ \\   /__\\// //  //  / /\\/ | '_ \\| | | |   | |/ _` | |/ /\\ \\/ / _ \\/ __|\r\n" + 
				" /\\_/ /  _  \\/ __ \\ /  \\//__  _\\ \\ / \\/  \\/ \\_//  / /    | |_) | |_| |   | | (_| |   <  >  <  __/\\__ \\\r\n" + 
				" \\___/\\_/ \\_/\\/  \\//_/\\_\\__/  \\__/ \\_____/\\___/   \\/     |_.__/ \\__, |  _/ |\\__,_|_|\\_\\/_/\\_\\___||___/\r\n" + 
				"                                                                |___/  |__/                           \r\n" + 
				"");
		if(currentLangauge == Langauges.ENGLISH) {
			System.out.println("created by Jakxes, (c) 2018, Jakxes Gmbh.");	
		} else if(currentLangauge == Langauges.GERMAN) {
			System.out.println("Erstellt von Jakxes, (c) 2018, Jakxes Gmbh.");
		} else if(currentLangauge == Langauges.POLISH) {
			System.out.println("Stworzony od Jakxes, (c) 2018, Jakxes Gmbh.");
		}
		System.out.println("");
        while (true) {
        	System.out.print(">");
        	
            String eingabe = scanner.nextLine();
            
           
            if(eingabe.equalsIgnoreCase("coder")) {
            	if(currentLangauge == Langauges.ENGLISH) {
            		System.out.println(prefix + "The coder is Jakxes.");
        		} else if(currentLangauge == Langauges.GERMAN) {
        			System.out.println(prefix + "Der Coder ist Jakxes.");
        		} else if(currentLangauge == Langauges.POLISH) {
        			System.out.println(prefix + "Koderem jest Jakxes");
        		}

            } else if(eingabe.startsWith("search ")) {
            	
            	String suche = eingabe.replace("search ", "");
            	if(currentLangauge == Langauges.ENGLISH) {
            		System.out.println(prefix + suche + " is searched...");
            	} else if(currentLangauge == Langauges.GERMAN) {
            		System.out.println(prefix + suche + " wird gesucht...");
            	} else if(currentLangauge == Langauges.POLISH) {
            		System.out.println(prefix + suche + " jest wyszukiwany...");
            	}
            	open(suche);
            } else if(eingabe.startsWith("s ")) {
            	String suche = eingabe.replace("s ", "");
            	if(currentLangauge == Langauges.ENGLISH) {
            		System.out.println(prefix + suche + " is searched...");
            	} else if(currentLangauge == Langauges.GERMAN) {
            		System.out.println(prefix + suche + " wird gesucht...");
            	} else if(currentLangauge == Langauges.POLISH) {
            		System.out.println(prefix + suche + " jest wyszukiwany...");
            	}
            	open(suche);
            } else if(eingabe.equalsIgnoreCase("clearchat") || eingabe.equalsIgnoreCase("cc")) {
            	 try {
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	    
            	if(currentLangauge == Langauges.ENGLISH) {
            		System.out.println(prefix + "The chat has been emptied.");
        		} else if(currentLangauge == Langauges.GERMAN) {
        			System.out.println(prefix + "Der Chat wurde geleert.");
        		} else if(currentLangauge == Langauges.POLISH) {
        			System.out.println(prefix + "Czat zostal oprozniony.");
        		}
            } else if(eingabe.startsWith("youtubesearch ")) {
            	String suche = eingabe.replace("youtubesearch ", "");
            	if(currentLangauge == Langauges.ENGLISH) {
            		System.out.println(prefix + suche + " is searched...");
            	} else if(currentLangauge == Langauges.GERMAN) {
            		System.out.println(prefix + suche + " wird gesucht...");
            	} else if(currentLangauge == Langauges.POLISH) {
            		System.out.println(prefix + suche + " jest wyszukiwany...");
            	}
            	youtube(suche);
            } else if(eingabe.startsWith("ys ")) {
            	String suche = eingabe.replace("ys ", "");
            	if(currentLangauge == Langauges.ENGLISH) {
            		System.out.println(prefix + suche + " is searched...");
            	} else if(currentLangauge == Langauges.GERMAN) {
            		System.out.println(prefix + suche + " wird gesucht...");
            	} else if(currentLangauge == Langauges.POLISH) {
            		System.out.println(prefix + suche + " jest wyszukiwany...");
            	}
            	youtube(suche);
            } else if(eingabe.equalsIgnoreCase("help")) {
            	if(currentLangauge == Langauges.ENGLISH) {
            		System.out.println(prefix + "Current commands are");
        		} else if(currentLangauge == Langauges.GERMAN) {
        			System.out.println(prefix + "Derzeitige Befehle sind:");
        		} else if(currentLangauge == Langauges.POLISH) {
        			System.out.println(prefix + "Biezace polecenia to:");
        		}
            	System.out.println(prefix + "Coder, search[s], shutdown, info, clearchat[cc], watch, stop, youtubesearch[ys], twittersearch[ts], twitteruser[tu], texttospeech[tts], language!");
            } else if(eingabe.startsWith("twittersearch ")) {
            	String suche = eingabe.replace("twittersearch ", "");
            	if(currentLangauge == Langauges.ENGLISH) {
            		System.out.println(prefix + suche + " is searched...");
            	} else if(currentLangauge == Langauges.GERMAN) {
            		System.out.println(prefix + suche + " wird gesucht...");
            	} else if(currentLangauge == Langauges.POLISH) {
            		System.out.println(prefix + suche + " jest wyszukiwany...");
            	}
            	twitter(suche);
            } else if(eingabe.startsWith("ts ")) {
            	String suche = eingabe.replace("ts ", "");
            	if(currentLangauge == Langauges.ENGLISH) {
            		System.out.println(prefix + suche + " is searched...");
            	} else if(currentLangauge == Langauges.GERMAN) {
            		System.out.println(prefix + suche + " wird gesucht...");
            	} else if(currentLangauge == Langauges.POLISH) {
            		System.out.println(prefix + suche + " jest wyszukiwany...");
            	}
            	twitter(suche);
            } else if(eingabe.startsWith("twitteruser ")) {
            	String suche = eingabe.replace("twitteruser ", "");
            	if(currentLangauge == Langauges.ENGLISH) {
            		System.out.println(prefix + suche + " is searched...");
            	} else if(currentLangauge == Langauges.GERMAN) {
            		System.out.println(prefix + suche + " wird gesucht...");
            	} else if(currentLangauge == Langauges.POLISH) {
            		System.out.println(prefix + suche + " jest wyszukiwany...");
            	}
            	twitteruser(suche);
            } else if(eingabe.startsWith("tu ")) {
            	String suche = eingabe.replaceFirst("tu ", "");
            	if(currentLangauge == Langauges.ENGLISH) {
            		System.out.println(prefix + suche + " is searched...");
            	} else if(currentLangauge == Langauges.GERMAN) {
            		System.out.println(prefix + suche + " wird gesucht...");
            	} else if(currentLangauge == Langauges.POLISH) {
            		System.out.println(prefix + suche + " jest wyszukiwany...");
            	}
            	twitteruser(suche);
            } else if(eingabe.startsWith("texttospeech ")) {
            	String suche = eingabe.replace("texttospeech ", "").replaceAll("ü", "ue").replaceAll("ä", "ae").replaceAll("ö", "oe");
            	if(currentLangauge == Langauges.ENGLISH) {
            		System.out.println(prefix + suche + " will be played..");
            	} else if(currentLangauge == Langauges.GERMAN) {
            		System.out.println(prefix + suche + " wird abgespielt...");
            	} else if(currentLangauge == Langauges.POLISH) {
            		System.out.println(prefix + suche + " beda odtwarzane...");
            	}
            	texttospeech(suche);
            } else if(eingabe.startsWith("tts ")) {
                	String suche = eingabe.replaceFirst("tts ", "").replaceAll("ü", "ue").replaceAll("ä", "ae").replaceAll("ö", "oe");
                	if(currentLangauge == Langauges.ENGLISH) {
                		System.out.println(prefix + suche + " will be played..");
                	} else if(currentLangauge == Langauges.GERMAN) {
                		System.out.println(prefix + suche + " wird abgespielt...");
                	} else if(currentLangauge == Langauges.POLISH) {
                		System.out.println(prefix + suche + " beda odtwarzane...");
                	}
                	texttospeech(suche);
            } else if(eingabe.startsWith("watch ")) {
            	String suche = eingabe.replaceFirst("watch ", "");
            	if(currentLangauge == Langauges.ENGLISH) {
            		System.out.println(prefix + suche + " will be played..");
            	} else if(currentLangauge == Langauges.GERMAN) {
            		System.out.println(prefix + suche + " wird abgespielt...");
            	} else if(currentLangauge == Langauges.POLISH) {
            		System.out.println(prefix + suche + " beda odtwarzane...");
            	}
            	watch(suche);
            } else if(eingabe.startsWith("language ")) {
            	String text = eingabe.replace("language ", "");
            	if(text.equalsIgnoreCase("english")) {
            		currentLangauge = Langauges.ENGLISH;
            		System.out.println(prefix + "Langauge changed.");
            	} else if(text.equalsIgnoreCase("german")) {
            		currentLangauge = Langauges.GERMAN;
            		System.out.println("Sprache geändert.");
            	} else if(text.equalsIgnoreCase("polish")) {
            		currentLangauge = Langauges.POLISH;
            		System.out.println("Zmieniono jezyk.");
            	}
            } else if(eingabe.equalsIgnoreCase("shutdown")) {
            	 Runtime runtime = Runtime.getRuntime();
            	    Process proc = runtime.exec("shutdown -s -t 0");
            	    System.exit(0);
            } else if(eingabe.trim().equalsIgnoreCase("")) {
            	
            } else if(eingabe.equalsIgnoreCase("info")) {
            	System.out.println("-----------------");
            	System.out.println(" Coder | Jakxes  ");
            	System.out.println(" Version | 1.0   ");
            	System.out.println(" Name | Jakxesbot");
            	System.out.println("-----------------");
            } else if(eingabe.equalsIgnoreCase("stop")) {
            	System.out.println("___________.__                   __                              __ ________  \r\n" + 
            			"\\__    ___/|  |__ _____    ____ |  | __  ___.__. ____  __ __    / / \\_____  \\ \r\n" + 
            			"  |    |   |  |  \\\\__  \\  /    \\|  |/ / <   |  |/  _ \\|  |  \\  / /    _(__  < \r\n" + 
            			"  |    |   |   Y  \\/ __ \\|   |  \\    <   \\___  (  <_> )  |  /  \\ \\   /       \\\r\n" + 
            			"  |____|   |___|  (____  /___|  /__|_ \\  / ____|\\____/|____/    \\_\\ /______  /\r\n" + 
            			"                \\/     \\/     \\/     \\/  \\/                                \\/ \r\n" + 
            			"");
            	System.exit(1);
            } else {
            	if(currentLangauge == Langauges.ENGLISH) {
            		
            		System.out.println(prefix + "Unknown command, use Help");
        		} else if(currentLangauge == Langauges.GERMAN) {
        			System.out.println(prefix + "Unbekannter Befehl, nutze Help");
        		} else if(currentLangauge == Langauges.POLISH) {
        			System.out.println(prefix + "Nieznane polecenie, uzyj Help");
        		}
            }
		}
		
   		
	}
	
	public static void open(String seite) {
		try {
			 Runtime.getRuntime().exec(
	                    "rundll32 url.dll,FileProtocolHandler "
	                            + "https://www.google.com/search?q="+seite.replaceAll(" ", "+")+"&ie=utf-8&oe=utf-8&client=firefox-b-ab");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	
	public static void youtube(String seite) {
		try {
			 Runtime.getRuntime().exec(
	                    "rundll32 url.dll,F ileProtocolHandler "
	                            + "https://www.youtube.com/results?search_query="+ seite.replaceAll(" ", "+"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    }
	public static void twitter(String seite) {
		try {
			 Runtime.getRuntime().exec(
	                    "rundll32 url.dll,FileProtocolHandler "
	                            + "https://twitter.com/search?q="+ seite.replaceAll(" ", "%20")+"&src=typd");
		} catch (IOException e) {
			 
			e.printStackTrace();
		}
    }
	public static void twitteruser(String seite) {
		try {
			 Runtime.getRuntime().exec(
	                    "rundll32 url.dll,FileProtocolHandler "
	                            + "https:twitter.com"+ seite);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    }
	public static void texttospeech(String text) {
	
		try {
			 Runtime.getRuntime().exec(
	                    "rundll32 url.dll,FileProtocolHandler "
	                            + "https://translate.google.com/translate_tts?ie=UTF-8&q="+text.replaceAll(" ", "%20")+"&tl="+checkLanguage()+"&client=tw-ob");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    }
	
	public static void watch(String id) { 
		
		try {
			 Runtime.getRuntime().exec(
	                    "rundll32 url.dll,FileProtocolHandler "
	                            + "https://www.youtube.com/watch?v=" + id);
		} catch (IOException e) {
			 
			e.printStackTrace();
		}
    }
	
	public static String checkLanguage() {
		if(currentLangauge == Langauges.ENGLISH) {
			return "en";
		} else if(currentLangauge == Langauges.GERMAN) {
			return "de";
		} else if(currentLangauge == Langauges.POLISH) {
			return "pl";
		}
		return "";
	}
	
	
}
