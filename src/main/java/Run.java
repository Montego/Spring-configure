import entity.*;
import entity.Character;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.impl.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static entity.TypeArmor.*;
import static entity.TypeWeapon.*;

@Slf4j
public class Run {

    //private static final Logger log = LoggerFactory.getLogger(Run.class);

    public static void main(String[] args) {

        log.info("Application start");
        log.error("This is error log!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        UserService userService = context.getBean(UserService.class);
        PasswordService passwordService = context.getBean(PasswordService.class);
        AuthorityService authorityService = context.getBean(AuthorityService.class);
        CharacterService characterService = context.getBean(CharacterService.class);
        AttributeSetService attributeSetService = context.getBean(AttributeSetService.class);
        ArmorService armorService = context.getBean(ArmorService.class);
        WeaponService weaponService = context.getBean(WeaponService.class);
        RaceService raceService = context.getBean(RaceService.class);
        //BattlefieldService battlefieldService = context.getBean(BattlefieldService.class);

        Password password1 = new Password();
        password1.setPassword("Password1");
        passwordService.addPassword(password1);
        Password password2 = new Password();
        password2.setPassword("Password2");
        passwordService.addPassword(password2);

//        Authority adminRole = new Authority();
//        adminRole.setAuthority("ADMIN");
//        authorityService.addAuthority(adminRole);
        Authority userRole = new Authority();
        userRole.setAuthority("ROLE_USER");
        authorityService.addAuthority(userRole);

        User user1 = new User("User1", password1);
        userService.addUser(user1);

        User user2 = new User("User2", password2);
        userService.addUser(user2);

        Weapon weapon1 = new Weapon(20, SWORD, "SWORD");
        Weapon weapon2 = new Weapon(30, SPEAR, "SPEAR");
        Weapon weapon3 = new Weapon(35, MACE, "MACE");
        Weapon weapon4 = new Weapon(25, BOW, "BOW");
        weaponService.addWeapon(weapon1);
        weaponService.addWeapon(weapon2);
        weaponService.addWeapon(weapon3);
        weaponService.addWeapon(weapon4);

        //List<Armor> armors = IntStream.range(0, 10).boxed().map(i -> new Armor(new Random().nextInt(), TypeArmor.values()[(int)Math.random()*TypeArmor.values().length], String.valueOf(new Random().nextLong()))).collect(Collectors.toList());

        Armor headArmor1 = new Armor(10, HEAD, "шлем1");
        Armor bodyArmor1 = new Armor(15, BODY, "доспех1");
        Armor legsArmor1 = new Armor(5, LEGS, "поножи1");
        Armor headArmor2 = new Armor(15, HEAD, "шлем2");
        Armor bodyArmor2 = new Armor(10, BODY, "доспех2");
        Armor legsArmor2 = new Armor(20, LEGS, "поножи2");
        Armor headArmor3 = new Armor(12, HEAD, "шлем3");
        Armor bodyArmor3 = new Armor(20, BODY, "доспех3");
        Armor legsArmor3 = new Armor(1, LEGS, "поножи3");
        Armor headArmor4 = new Armor(10, HEAD, "шлем4");
        Armor bodyArmor4 = new Armor(10, BODY, "доспех4");
        Armor legsArmor4 = new Armor(1, LEGS, "поножи4");
        List<Armor> armors1 = new ArrayList<Armor>();
        ArrayList<Armor> armors2 = new ArrayList<Armor>();
        ArrayList<Armor> armors3 = new ArrayList<Armor>();
        ArrayList<Armor> armors4 = new ArrayList<Armor>();


//        Map<String,Armor> allArmors = new HashMap<>();
//        allArmors.put("шлем №1",headArmor1);
//        allArmors.put("шлем №2",headArmor2);
//        allArmors.put("шлем №3",headArmor3);
//        allArmors.put("шлем №4",headArmor4);
//        allArmors.put("доспех №1",bodyArmor1);
//        allArmors.put("доспех №2",bodyArmor2);
//        allArmors.put("доспех №3",bodyArmor3);
//        allArmors.put("доспех №4",bodyArmor4);
//        allArmors.put("поножи №1",legsArmor1);
//        allArmors.put("поножи №2",legsArmor2);
//        allArmors.put("поножи №3",legsArmor3);
//        allArmors.put("поножи №4",legsArmor4);


        armors1.add(headArmor1);
        armors1.add(bodyArmor1);
        armors1.add(legsArmor1);
        armors2.add(headArmor2);
        armors2.add(bodyArmor2);
        armors2.add(legsArmor2);
        armors3.add(headArmor3);
        armors3.add(bodyArmor3);
        armors3.add(legsArmor3);
        armors4.add(headArmor4);
        armors4.add(bodyArmor4);
        armors4.add(legsArmor4);


        armorService.addArmor(headArmor1);
        armorService.addArmor(bodyArmor1);
        armorService.addArmor(legsArmor1);
        armorService.addArmor(headArmor2);
        armorService.addArmor(bodyArmor2);
        armorService.addArmor(legsArmor2);
        armorService.addArmor(headArmor3);
        armorService.addArmor(bodyArmor3);
        armorService.addArmor(legsArmor3);
        armorService.addArmor(headArmor4);
        armorService.addArmor(bodyArmor4);
        armorService.addArmor(legsArmor4);

        AttributeSet humanSet = new AttributeSet(14, 12, 9);
        AttributeSet orcSet = new AttributeSet(20, 10, 5);
        AttributeSet elfSet = new AttributeSet(17, 8, 10);
        attributeSetService.addAttributeSet(humanSet);
        attributeSetService.addAttributeSet(orcSet);
        attributeSetService.addAttributeSet(elfSet);

        Race human = new Race("HUMAN", humanSet);
        Race orc = new Race("ORC", orcSet);
        Race elf = new Race("ELF", elfSet);
        raceService.addRace(human);
        raceService.addRace(orc);
        raceService.addRace(elf);

        Character character1 = new Character("CHARACTER №1", user1, armors1, weapon1, human);
        characterService.addCharacter(character1);
        Character character2 = new Character("CHARACTER №2", user1, armors2, weapon2, orc);
        characterService.addCharacter(character2);
        Character character3 = new Character("CHARACTER №3", user2, armors3, weapon3, orc);
        characterService.addCharacter(character3);
        Character character4 = new Character("CHARACTER №4", user2, armors4, weapon4, elf);
        characterService.addCharacter(character4);

        log.info("Aplication stop");


    }
}