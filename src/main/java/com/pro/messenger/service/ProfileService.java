package com.pro.messenger.service;

import com.pro.messenger.DatabaseMock;
import com.pro.messenger.model.Profile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created on 30.12.2015.
 */
public class ProfileService {
    private static Map<String, Profile> profiles = DatabaseMock.getProfiles();

    public ProfileService() {
        addProfile(new Profile(100, "Nehru", "McKenzie", "Battle"));
        addProfile(new Profile(101, "Jordan", "Hedda", "Acevedo"));
        addProfile(new Profile(102, "Mariam", "Lucy", "Dawson"));
        addProfile(new Profile(103, "Dexter", "Marcia", "Bradley"));
        addProfile(new Profile(104, "Hanae", "Sydney", "Cortez"));
        addProfile(new Profile(105, "Raya", "Zenia", "Patel"));
        addProfile(new Profile(106, "Anthony", "Urielle", "Lindsey"));
        addProfile(new Profile(107, "Kimberley", "Blaine", "Saunders"));
        addProfile(new Profile(108, "Keiko", "Sydney", "Kinney"));
        addProfile(new Profile(109, "Miriam", "Rachel", "Bradford"));
        addProfile(new Profile(110, "Orlando", "Shea", "Rosa"));
        addProfile(new Profile(111, "Ramona", "Jaden", "Newton"));
        addProfile(new Profile(112, "Noelani", "Eliana", "Dickson"));
        addProfile(new Profile(113, "Prescott", "Jocelyn", "Simon"));
        addProfile(new Profile(114, "Conan", "Scarlet", "Welch"));
        addProfile(new Profile(115, "Hiram", "Pandora", "Holt"));
        addProfile(new Profile(116, "Josephine", "Quin", "Leon"));
        addProfile(new Profile(117, "Josiah", "Patience", "Saunders"));
        addProfile(new Profile(118, "Bevis", "Eugenia", "Wheeler"));
        addProfile(new Profile(119, "Macey", "Ciara", "Leach"));
        addProfile(new Profile(120, "Neve", "Paloma", "Mcclain"));
        addProfile(new Profile(121, "Hoyt", "Audra", "Ross"));
        addProfile(new Profile(122, "Octavius", "Mollie", "Drake"));
        addProfile(new Profile(123, "Jelani", "Charde", "Johnston"));
        addProfile(new Profile(124, "Halla", "Sasha", "Atkins"));
        addProfile(new Profile(125, "Julian", "Maya", "Schultz"));
        addProfile(new Profile(126, "Zoe", "Nyssa", "Guy"));
        addProfile(new Profile(127, "Driscoll", "Bryar", "Arnold"));
        addProfile(new Profile(128, "Iola", "Lysandra", "Charles"));
        addProfile(new Profile(129, "Jessica", "Leandra", "Herrera"));
        addProfile(new Profile(130, "Sonia", "Odette", "Deleon"));
        addProfile(new Profile(131, "Skyler", "Lana", "Hampton"));
        addProfile(new Profile(132, "Leroy", "Meredith", "Greene"));
        addProfile(new Profile(133, "Frances", "Sybill", "Parrish"));
        addProfile(new Profile(134, "Jolie", "Aileen", "Mclaughlin"));
        addProfile(new Profile(135, "Shelby", "Fleur", "Kidd"));
        addProfile(new Profile(136, "Kim", "Gisela", "Wilkerson"));
        addProfile(new Profile(137, "Echo", "Rose", "Thornton"));
        addProfile(new Profile(138, "Amelia", "Kelly", "Sherman"));
        addProfile(new Profile(139, "Hector", "Evelyn", "Becker"));
        addProfile(new Profile(140, "Lunea", "Sylvia", "Conner"));
        addProfile(new Profile(141, "Kerry", "Whitney", "Mckenzie"));
        addProfile(new Profile(142, "Ciaran", "Mikayla", "Conrad"));
        addProfile(new Profile(143, "Maris", "Giselle", "David"));
        addProfile(new Profile(144, "Imani", "Nyssa", "Hobbs"));
        addProfile(new Profile(145, "Buckminster", "Quon", "Reese"));
        addProfile(new Profile(146, "Cruz", "Tamekah", "Carpenter"));
        addProfile(new Profile(147, "Ashely", "Adrienne", "Lara"));
        addProfile(new Profile(148, "Madeline", "Margaret", "Snider"));
        addProfile(new Profile(149, "Victoria", "Tamara", "Ryan"));
        addProfile(new Profile(150, "Ronan", "Rachel", "Grimes"));
        addProfile(new Profile(151, "Mollie", "Lacey", "Delacruz"));
        addProfile(new Profile(152, "Ella", "Olympia", "Craig"));
        addProfile(new Profile(153, "Sharon", "Lani", "Solis"));
        addProfile(new Profile(154, "Rashad", "Sydnee", "Ellison"));
        addProfile(new Profile(155, "Noelle", "Joy", "Garza"));
        addProfile(new Profile(156, "Abraham", "Diana", "Boyle"));
        addProfile(new Profile(157, "Rowan", "Ivy", "Mercado"));
        addProfile(new Profile(158, "Nolan", "Leandra", "Gilliam"));
        addProfile(new Profile(159, "Quintessa", "Liberty", "Mckay"));
        addProfile(new Profile(160, "Sebastian", "Octavia", "Estes"));
        addProfile(new Profile(161, "Knox", "Gloria", "Contreras"));
        addProfile(new Profile(162, "Courtney", "Sharon", "May"));
        addProfile(new Profile(163, "Isabelle", "Nayda", "Boone"));
        addProfile(new Profile(164, "Solomon", "Tamekah", "Roy"));
        addProfile(new Profile(165, "Troy", "Aretha", "Roberts"));
        addProfile(new Profile(166, "Avram", "Latifah", "Lott"));
        addProfile(new Profile(167, "Lucas", "Gemma", "Reid"));
        addProfile(new Profile(168, "Eaton", "Ingrid", "Norris"));
        addProfile(new Profile(169, "Maia", "Cally", "Meyer"));
        addProfile(new Profile(170, "Thor", "Christine", "Frazier"));
        addProfile(new Profile(171, "Lani", "Amber", "Charles"));
        addProfile(new Profile(172, "April", "Lilah", "Gilbert"));
        addProfile(new Profile(173, "Molly", "Jacqueline", "Mills"));
        addProfile(new Profile(174, "Jessamine", "Mechelle", "Chang"));
        addProfile(new Profile(175, "Lila", "Hadassah", "Santos"));
        addProfile(new Profile(176, "Len", "Nicole", "Poole"));
        addProfile(new Profile(177, "Phelan", "Judith", "Moreno"));
        addProfile(new Profile(178, "Solomon", "TaShya", "Madden"));
        addProfile(new Profile(179, "Christopher", "Donna", "Alston"));
        addProfile(new Profile(180, "Lacey", "Katell", "Eaton"));
        addProfile(new Profile(181, "Rowan", "Lareina", "Kelley"));
        addProfile(new Profile(182, "Bree", "Elaine", "Dickson"));
        addProfile(new Profile(183, "Ori", "Destiny", "Shepard"));
        addProfile(new Profile(184, "Heidi", "Shelly", "Ortiz"));
        addProfile(new Profile(185, "Prescott", "Minerva", "Waller"));
        addProfile(new Profile(186, "Jacob", "Lacota", "Buckley"));
        addProfile(new Profile(187, "Kirk", "Cherokee", "Guzman"));
        addProfile(new Profile(188, "Rhiannon", "Uta", "Raymond"));
        addProfile(new Profile(189, "Shaeleigh", "Lareina", "Olson"));
        addProfile(new Profile(190, "Donovan", "Julie", "Howe"));
        addProfile(new Profile(191, "Cameron", "Martina", "Baird"));
        addProfile(new Profile(192, "Fulton", "Iliana", "Salas"));
        addProfile(new Profile(193, "Mara", "Jessica", "Norton"));
        addProfile(new Profile(194, "Akeem", "Rhiannon", "Dickerson"));
        addProfile(new Profile(195, "Raymond", "Hayfa", "Talley"));
        addProfile(new Profile(196, "Quincy", "Emily", "Waters"));
        addProfile(new Profile(197, "Zephania", "Shelly", "Baker"));
        addProfile(new Profile(198, "Whoopi", "Aimee", "Camacho"));
        addProfile(new Profile(199, "Uriah", "Darrel", "Sharp"));
    }

    public List<Profile> getProfiles () {
        return new ArrayList<>(profiles.values());
    }

    public List<Profile> getProfilesPaginated(int fromIndex, int toIndex) {
        ArrayList<Profile> list = new ArrayList<>(profiles.values());
        if (fromIndex + toIndex > profiles.size()) {
            return new ArrayList<>();
        }
        return list.subList(fromIndex, toIndex);
    }

    public Profile getProfile (String name) {
        return profiles.get(name);
    }

    public Profile addProfile (Profile profile) {
        profile.setCreated(new Date());
        profiles.put(profile.getName(), profile);
        return profile;
    }

    public Profile updateProfile (Profile profile) {
        if (profile.getId() > 0 && profile.getName() != null) {
            profiles.put(profile.getName(), profile);
        }
        return profile;
    }

    public void removeProfile (String name) {
        profiles.remove(name);
    }
}

