import entity.*;
import entity.Character;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.impl.*;

import java.util.ArrayList;

import static entity.TypeArmor.*;
import static entity.TypeWeapon.SPEAR;
import static entity.TypeWeapon.SWORD;

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

        Password password = new Password();
        password.setPassword("Password1");
        passwordService.addPassword(password);

        Authority authority = new Authority();
        authority.setAuthority("ADMIN");
        authorityService.addAuthority(authority);
        authorityService.getAuthority(authority);


        User user = new User("User1", password);
//        user.setLogin("lsdkfjldskjfl");
//        user.setPassword(password);
        user.setRole(authority);
        userService.addUser(user);

        Character character1 = new Character();
        //characterService.addCharacter(character1);
        Character character2 = new Character();
        //characterService.addCharacter(character2);


        AttributeSet attributeSet1 = new AttributeSet();
        AttributeSet attributeSet2 = new AttributeSet();
        attributeSet1.setAttack(10);
        attributeSet1.setDefence(20);
        attributeSet1.setNonDamageChance(15);
        attributeSet2.setAttack(15);
        attributeSet2.setDefence(15);
        attributeSet2.setNonDamageChance(20);
        attributeSetService.addAttributeSet(attributeSet1);
        attributeSetService.addAttributeSet(attributeSet2);


        Weapon weapon1 = new Weapon(20, SWORD);
        weapon1.setName("SWOOOOOORD!");
        Weapon weapon2 = new Weapon(30, SPEAR);
        weapon2.setName("SPEEEEAARRR!");
        ArrayList<Weapon> weapons1 = new ArrayList<Weapon>();
        ArrayList<Weapon> weapons2 = new ArrayList<Weapon>();
        weapons1.add(weapon1);
        weapons2.add(weapon2);
        weaponService.addWeapon(weapon1);
        weaponService.addWeapon(weapon2);


        Armor headArmor1 = new Armor(10, HEAD,"шлем1");
        Armor bodyArmor1 = new Armor(15, BODY,"доспех1");
        Armor legsArmor1 = new Armor(5, LEGS,"поножи1");
        Armor headArmor2 = new Armor(15, HEAD,"шлем2");
        Armor bodyArmor2 = new Armor(10, BODY,"доспех2");
        Armor legsArmor2 = new Armor(20, LEGS,"поножи2");
        ArrayList<Armor> armors1 = new ArrayList<Armor>();
        ArrayList<Armor> armors2 = new ArrayList<Armor>();
        armors1.add(headArmor1);
        armors1.add(bodyArmor1);
        armors1.add(legsArmor1);
        armors2.add(headArmor2);
        armors2.add(bodyArmor2);
        armors2.add(legsArmor2);
        armorService.addArmor(headArmor1);
        armorService.addArmor(bodyArmor1);
        armorService.addArmor(legsArmor1);
        armorService.addArmor(headArmor2);
        armorService.addArmor(bodyArmor2);
        armorService.addArmor(legsArmor2);


        character1.setName("VASYA");
        character1.setAttributeSet(attributeSet1);
        character1.setArmor(armors1);
        character1.setWeapon(weapons1);

        character2.setName("PETYA");
        character2.setAttributeSet(attributeSet2);
        character2.setArmor(armors2);
        character2.setWeapon(weapons2);
        characterService.addCharacter(character1);
        characterService.addCharacter(character2);
        log.info("Aplication stop");

    }
}