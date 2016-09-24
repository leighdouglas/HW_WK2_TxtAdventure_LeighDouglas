package nyc.c4q.leighdouglas;

import java.util.Scanner;

public class Prompts {

    public static void startGame(){
        System.out.println("Welcome to Confluence! Embark on the journey of a lifetime!\n \n \n \n \n  " +
                        " ▄████▄   ▒█████   ███▄    █   █████▒██▓     █    ██ ▓█████  ███▄    █  ▄████▄  ▓█████ \n" +
                        "▒██▀ ▀█  ▒██▒  ██▒ ██ ▀█   █ ▓██   ▒▓██▒     ██  ▓██▒▓█   ▀  ██ ▀█   █ ▒██▀ ▀█  ▓█   ▀ \n" +
                        "▒▓█    ▄ ▒██░  ██▒▓██  ▀█ ██▒▒████ ░▒██░    ▓██  ▒██░▒███   ▓██  ▀█ ██▒▒▓█    ▄ ▒███   \n" +
                        "▒▓▓▄ ▄██▒▒██   ██░▓██▒  ▐▌██▒░▓█▒  ░▒██░    ▓▓█  ░██░▒▓█  ▄ ▓██▒  ▐▌██▒▒▓▓▄ ▄██▒▒▓█  ▄ \n" +
                        "▒ ▓███▀ ░░ ████▓▒░▒██░   ▓██░░▒█░   ░██████▒▒▒█████▓ ░▒████▒▒██░   ▓██░▒ ▓███▀ ░░▒████▒\n" +
                        "░ ░▒ ▒  ░░ ▒░▒░▒░ ░ ▒░   ▒ ▒  ▒ ░   ░ ▒░▓  ░░▒▓▒ ▒ ▒ ░░ ▒░ ░░ ▒░   ▒ ▒ ░ ░▒ ▒  ░░░ ▒░ ░\n" +
                        "  ░  ▒     ░ ▒ ▒░ ░ ░░   ░ ▒░ ░     ░ ░ ▒  ░░░▒░ ░ ░  ░ ░  ░░ ░░   ░ ▒░  ░  ▒    ░ ░  ░\n" +
                        "░        ░ ░ ░ ▒     ░   ░ ░  ░ ░     ░ ░    ░░░ ░ ░    ░      ░   ░ ░ ░           ░   \n" +
                        "░ ░          ░ ░           ░            ░  ░   ░        ░  ░         ░ ░ ░         ░  ░\n" +
                        "░                                                                      ░               \n" +
                        "     ░                                           ░                                     \n \n \n \n" +
        "Would you like to start your journey? (Type yes or no)");
    }

    public static void mouth(){
        System.out.println("You wake up from what seems like a deep slumber atop something soft and warm....You're clothes are completely \n" +
                "soaked, and you have a killer headache, You try to stand up but the area you are standing on gives and you fall over. \n" +
                "You regain your footing. Where are you? You look around. You're in a narrow, pink room. \n" +
                "It's dark and hard to see. Ahead of you, you the room narrows until complete darkness. Do you go forward? (y/n)");
    }


    public static void stillInMouth(){
        System.out.println("You turn around and see large, towering white doors surrounding you. You try to push through them, but \n" +
                "they don't budge. I guess you can't go this way. Do you go forward? (y/n)");
    }

    public static void throat(){
        System.out.println("You walk forward, careful not to slip again. You approach the edge of the soft ground you're walking \n" +
                "on. Finally, you're standing at the edge of the darkness. You hesitate, but continue walking forward. The only \n" +
                "comfort you feel is the increasing warmth getting stronger the further you walk into the darkness. Finally, you come upon a \n" +
                "dimly lit chamber. In front of you are the entrances to two different paths. The path on the right has a huge door that \n" +
                "rhythmically opens and closes. Each time the door opens, you can feel an incredibly strong breeze enters and exits the door. \n" +
                "The path on the left seems to be more warmth and darkness. Do you choose the path on the left? Or right? (l/r)");
    }

    public static void lungs(){
        System.out.println("You approach the rhythmic doors at the entrance of the tunnel on the right. As you approach, the \n" +
                "gusts of wind get stronger and stronger. A huge gust of wind sucks you into the chamber. You tumble down the tunnel. \n" +
                "Your fall suddenly comes to a stop and you land on what looks like a tree-branch.  When you regain your composure, \n" +
                "you see that you're in a vast, brightly lit room. You can feel the air around you moving in many directions around you. Inside of \n" +
                "this room, there seems to be a vast network of branches, expanding out as far as you can see. At the end of each branch \n" +
                "are tiny sponge-like orbs. They seem to be absorbing the air. You quite like this room, but it's a bit cold. You could \n" +
                "stay here. You also feel this strong desire to go towards one of these orbs. You also see a small opening a little ways \n" +
                "down from you. You could probably crawl into it...What do you do? (stay/touch orb)");
    }

    public static void stomach(){
        System.out.println("You take the tunnel to the left. The ground is slippery. The incline starts to slope downwards. \n" +
                "You slip and fall, and begin to slide violently down the tunnel. You come through an opening and fall through \n" +
                "the air, landing in a giant pool of liquid. It's hot and bubbly, but it doesn't burn you. Above you, the pink \n" +
                "walls tower up towards the hole you fell through. Around you, there are large pieces of mush floating around. The liquid \n" +
                "seems to break them down, and the walls absorb them. You could stay for a swim, but you seem to be drawn towards \n" +
                "the walls...what do you do? (stay/swim to wall)");
    }

    public static void burpEnding(){
        System.out.println("You decide to go for a swim and enjoy this warm, bubbly liquid. After swimming for some time, the walls \n" +
                "begin to violently shake. A huge bubble rises to the surface of the water. Oh no, it's going to burst! You try to \n" +
                "swim away but there is nowhere to go! Suddenly, the bubble pops and hot air blasts you upwards towards the hole you \n" +
                "fell through. You fly upwards back through the tunnel you came from, and back into the pink room you awoke in earlier, \n" +
                "right back where you started. After resting from this, you decide to live out the rest of your days in this room. It's \n" +
                "better than going back down into the depths.....\n \n --------------- \ncongrats! you got the human to burp! (●´∀｀●) \n");
    }

    public static void coughEnding(){
        System.out.println("You quite like this room, and decide it's a fine place to hang out and rest for a while after your fall. \n" +
                "But after a few minutes of rest, you feel the room start to rumble. All of a sudden, the room violently shakes like an \n" +
                "earth quake. A strong gust of wind propels your body back up towards the tunnel you fell through. You fly through the \n" +
                "tunnel, and back into the pink room where you woke up not too long ago. This time, the large white doors have separated.\n" +
                "There's a light between them. You are flying towards it....suddenly, you hear a loud, booming noise and you are propelled even harder \n" +
                "towards the light....\n \n --------------- \ncongrats! you got the human to cough! (ノ ◑ ‿ ◑)ノ \n" );
    }

    public static void absorbedFromLungs(){
        System.out.println("The urge to touch one of these orbs takes over and you climb towards it. As soon as your fingertips touch the orb ");
    }

    public static void absorbedFromStomach(){
        System.out.println("You swim towards the walls of the stomach. As you raise your hand to touch the wall, ");
    }

    public static void absorbed(){
        System.out.println("your body bursts into a million particles - but it isn't painful. You find yourself immersed in \n" +
                "a beautiful red liquid. You look down at the remnants of your body, and see that you have been transformed \n" +
                "into a tiny red droplet. You look around and see you are traveling with millions of other particles around \n" +
                "you. Were the other parts of you also transformed into these red droplets? Are you traveling with them? As \n" +
                "you ask yourself these questions, you feel a rhythmic thumping in the distance. It's getting stronger and \n" +
                "stronger. You approach another fork in your path. The path to the right seems to be where the loud beat is \n" +
                "coming from....but the path on the left continues forward. Do you venture down right path and abandon the \n" +
                "other particles of your body? Or do you go left and follow them? (l/r)");
    }

    public static void heart(){
        System.out.println("You follow the rhythm and venture to the right. The thumping is getting louder and louder. Quickly, you come \n" +
                "upon a huge red room with several chambers. You discover that the thumping is a group of tiny particles rhythmically \n" +
                "pushing other red droplets through the small openings to other chambers. They ask you to join them. You could stay and \n" +
                "help them push, or you could continue on your journey. Which do you chose? (stay/leave)");
    }

    public static void brainEnding(){
        System.out.println("You continue down the path towards the right. You are enjoying floating with the other particles that used to form you. \n" +
                "All of a sudden, you come upon a grey, wrinkled mass. There's just enough room in between the crease of the wrinkles to fit yourself \n" +
                "through. You push yourself through and find yourself in yet another room. This time, you see several particles in what looks like a \n" +
                "control room. Above you is another vast network of branches, but this time you see flashes of light traveling from one branch to another. \n" +
                "There are millions of them! You see that the particles are pushing several buttons at a time, causing electricity to run through these \n" +
                "branches. Amazing! You decided to stay and help them, as it seems like a very logical thing to do \n \n --------------- \n congrats! " +
                "you got the brain ending! ლ(╹◡╹ლ)\n");
    }

    public static void heartEnding(){
        System.out.println("You aren't exactly sure where you are, but you decide to help them. Looks like they really need " +
                "it! You overhear a group of red droplets passing by refer to this room as the 'heart'. You aren't sure what " +
                "you're doing, but you feel like you're contributing to a greater purpose. You decide to live out your days in " +
                "this 'heart', whatever that means \n \n --------------- \n congrats! you got the heart ending! ( ♥ ◡ ♥ ) \n");
    }
}
