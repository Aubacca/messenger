package com.pro.messenger.service;

import com.pro.messenger.DatabaseMock;
import com.pro.messenger.model.Comment;
import com.pro.messenger.model.Message;

import java.util.*;

/**
 * Created on 05.01.2016.
 */
public class CommentService {

    private Map<Long, Message> messages = DatabaseMock.getMessages();

    private Map<Long, Comment> comments = new HashMap<>();

    public CommentService() {
        addComment(12, new Comment(1, "metus sit amet", "Erich"));
        addComment(33, new Comment(2, "sollicitudin a, malesuada", "Dora"));
        addComment(43, new Comment(3, "mollis lectus pede et", "Samson"));
        addComment(66, new Comment(4, "mauris erat", "Mark"));
        addComment(85, new Comment(5, "lorem", "Francesca"));
        addComment(46, new Comment(6, "nulla vulputate dui, ", "Stewart"));
        addComment(5, new Comment(7, "laoreet ipsum. Curabitur", "Risa"));
        addComment(15, new Comment(8, "lorem semper auctor.", "Abbot"));
        addComment(25, new Comment(9, "ultricies ligula.", "Brynne"));
        addComment(94, new Comment(10, "aliquet.", "Erich"));
        addComment(71, new Comment(11, "magna. Suspendisse tristique neque", "Echo"));
        addComment(85, new Comment(12, "quis, new Comment( pede. Praesent eu", "Malcolm"));
        addComment(39, new Comment(13, "suscipit", "Nevada"));
        addComment(53, new Comment(14, "mi", "Carolyn"));
        addComment(14, new Comment(15, "magna, new Comment( malesuada", "Yetta"));
        addComment(17, new Comment(16, "ut", "Meredith"));
        addComment(2, new Comment(17, "ultrices a, ", "Madeline"));
        addComment(26, new Comment(18, "ornare tortor at risus.", "Naida"));
        addComment(36, new Comment(19, "Aenean sed pede nec ante blandit", "Keely"));
        addComment(44, new Comment(20, "orci lacus vestibulum lorem, new Comment( sit", "David"));
        addComment(5, new Comment(21, "eleifend. Cras sed leo. Cras vehicula", "Mannix"));
        addComment(12, new Comment(22, "per inceptos hymenaeos.", "Aubrey"));
        addComment(92, new Comment(23, "mauris, new Comment( rhoncus id, new Comment( mollis nec, new Comment( cursus", "Nehru"));
        addComment(40, new Comment(24, "Nunc ut erat. Sed", "Daquan"));
        addComment(20, new Comment(25, "odio. Nam", "Janna"));
        addComment(61, new Comment(26, "sociis natoque penatibus et", "Alexander"));
        addComment(57, new Comment(27, "mauris sapien, new Comment( cursus in, new Comment( hendrerit consectetuer, ", "Regina"));
        addComment(44, new Comment(28, "a, ", "Slade"));
        addComment(97, new Comment(29, "erat volutpat. Nulla", "Acton"));
        addComment(27, new Comment(30, "dolor egestas rhoncus. Proin nisl", "Xavier"));
        addComment(7, new Comment(31, "vestibulum. Mauris magna. Duis dignissim tempor", "Rafael"));
        addComment(81, new Comment(32, "a, ", "Robin"));
        addComment(59, new Comment(33, "dapibus gravida. Aliquam", "Heidi"));
        addComment(29, new Comment(34, "nascetur ridiculus mus.", "Jeanette"));
        addComment(5, new Comment(35, "interdum", "Maggy"));
        addComment(16, new Comment(36, "orci lacus vestibulum", "Karen"));
        addComment(95, new Comment(37, "nec luctus felis purus", "Beau"));
        addComment(42, new Comment(38, "Sed id", "Jason"));
        addComment(58, new Comment(39, "sodales. Mauris blandit enim", "Charde"));
        addComment(20, new Comment(40, "dolor elit, new Comment( pellentesque a, new Comment( facilisis", "Elmo"));
        addComment(34, new Comment(41, "Mauris molestie pharetra nibh.", "Isaiah"));
        addComment(1, new Comment(42, "vestibulum nec, new Comment( euismod", "Jaime"));
        addComment(42, new Comment(43, "feugiat", "Melinda"));
        addComment(77, new Comment(44, "justo faucibus lectus, new Comment( a", "Noah"));
        addComment(69, new Comment(45, "eu, new Comment( eleifend nec, new Comment( malesuada", "Daria"));
        addComment(33, new Comment(46, "nec, ", "Ivana"));
        addComment(7, new Comment(47, "lectus", "Charles"));
        addComment(63, new Comment(48, "nunc est, new Comment( mollis non, new Comment( cursus non, ", "Haviva"));
        addComment(65, new Comment(49, "est. Nunc laoreet lectus quis", "Cherokee"));
        addComment(88, new Comment(50, "amet orci.", "Illana"));
        addComment(35, new Comment(51, "eget lacus. Mauris non", "Brynn"));
        addComment(46, new Comment(52, "enim.", "Malachi"));
        addComment(89, new Comment(53, "ac mattis", "Slade"));
        addComment(95, new Comment(54, "scelerisque mollis. Phasellus libero mauris, new Comment( aliquam", "Florence"));
        addComment(28, new Comment(55, "scelerisque", "Halla"));
        addComment(46, new Comment(56, "sagittis lobortis mauris.", "Jael"));
        addComment(76, new Comment(57, "sit amet nulla.", "Vernon"));
        addComment(82, new Comment(58, "diam at pretium aliquet, new Comment( metus urna", "Nayda"));
        addComment(20, new Comment(59, "mi, new Comment( ac mattis velit justo", "Len"));
        addComment(41, new Comment(60, "adipiscing lacus. Ut nec", "Jacob"));
        addComment(32, new Comment(61, "mollis nec, new Comment( cursus a, new Comment( enim. Suspendisse", "Lev"));
        addComment(49, new Comment(62, "sem, ", "Xyla"));
        addComment(10, new Comment(63, "feugiat tellus lorem eu metus. In", "Liberty"));
        addComment(55, new Comment(64, "mauris, new Comment( aliquam", "Yvette"));
        addComment(75, new Comment(65, "eu tempor erat neque non quam.", "Wyatt"));
        addComment(72, new Comment(66, "ut eros non enim commodo", "Zelda"));
        addComment(34, new Comment(67, "magna. Nam ligula elit, new Comment( pretium", "Lysandra"));
        addComment(40, new Comment(68, "Fusce aliquam, new Comment( enim nec", "Wynter"));
        addComment(84, new Comment(69, "mauris. Morbi non", "Fleur"));
        addComment(61, new Comment(70, "sed pede nec ante", "Hamish"));
        addComment(90, new Comment(71, "egestas", "Jescie"));
        addComment(15, new Comment(72, "ridiculus mus. Donec dignissim magna", "Theodore"));
        addComment(61, new Comment(73, "enim. Etiam imperdiet dictum magna. Ut", "Jacqueline"));
        addComment(46, new Comment(74, "tortor, new Comment( dictum", "Driscoll"));
        addComment(19, new Comment(75, "magnis dis parturient montes, new Comment( nascetur", "Lucian"));
        addComment(77, new Comment(76, "egestas lacinia. Sed", "Ursula"));
        addComment(42, new Comment(77, "egestas ligula. Nullam feugiat", "Keith"));
        addComment(45, new Comment(78, "a, ", "Montana"));
        addComment(59, new Comment(79, "egestas", "Chadwick"));
        addComment(61, new Comment(80, "tincidunt, new Comment( nunc ac", "Ila"));
        addComment(21, new Comment(81, "nibh lacinia orci, new Comment( consectetuer", "Robert"));
        addComment(99, new Comment(82, "Quisque ornare tortor at risus. Nunc", "Suki"));
        addComment(60, new Comment(83, "dui quis accumsan convallis, new Comment( ante", "Carl"));
        addComment(7, new Comment(84, "pede ac urna. Ut tincidunt vehicula", "Evelyn"));
        addComment(3, new Comment(85, "nisl. Quisque fringilla euismod enim.", "Martena"));
        addComment(11, new Comment(86, "mauris", "Thor"));
        addComment(8, new Comment(87, "Donec luctus aliquet odio. Etiam", "Hanna"));
        addComment(25, new Comment(88, "orci luctus", "Stacey"));
        addComment(82, new Comment(89, "vestibulum massa rutrum magna. Cras convallis", "Marshall"));
        addComment(79, new Comment(90, "enim non nisi.", "Mark"));
        addComment(72, new Comment(91, "cursus.", "Evelyn"));
        addComment(51, new Comment(92, "mollis nec, new Comment( cursus a, ", "Wanda"));
        addComment(91, new Comment(93, "diam. Sed diam", "Ursula"));
        addComment(44, new Comment(94, "sapien imperdiet ornare. In faucibus. Morbi", "Mariko"));
        addComment(50, new Comment(95, "netus et malesuada fames", "Sophia"));
        addComment(28, new Comment(96, "tempor bibendum. Donec", "Phoebe"));
        addComment(53, new Comment(97, "Donec luctus", "Felicia"));
        addComment(45, new Comment(98, "ut erat.", "Lars"));
        addComment(50, new Comment(99, "in faucibus orci luctus et", "Colton"));
        addComment(12, new Comment(100, "a felis", "Justina"));
        addComment(97, new Comment(101, "Aenean eget magna.", "Nora"));
        addComment(87, new Comment(102, "posuere, new Comment( enim nisl elementum purus, new Comment( accumsan", "Nell"));
        addComment(86, new Comment(103, "et, ", "Jerry"));
        addComment(83, new Comment(104, "ligula consectetuer rhoncus. Nullam velit dui, ", "Branden"));
        addComment(56, new Comment(105, "nonummy ipsum non arcu. Vivamus sit", "Damon"));
        addComment(2, new Comment(106, "eu, new Comment( ultrices", "Marah"));
        addComment(45, new Comment(107, "Aliquam", "Joshua"));
        addComment(52, new Comment(108, "velit dui, new Comment( semper", "Riley"));
        addComment(40, new Comment(109, "magna tellus faucibus", "Jarrod"));
        addComment(42, new Comment(110, "arcu. Sed et libero.", "Warren"));
        addComment(90, new Comment(111, "Nulla eget", "Kellie"));
        addComment(8, new Comment(112, "ante. Maecenas mi", "Mara"));
        addComment(4, new Comment(113, "aliquet odio. Etiam ligula", "Imani"));
        addComment(28, new Comment(114, "vehicula", "Kelly"));
        addComment(17, new Comment(115, "Nulla eu neque pellentesque massa lobortis", "Leigh"));
        addComment(2, new Comment(116, "molestie arcu.", "Chandler"));
        addComment(31, new Comment(117, "dolor sit amet, new Comment( consectetuer", "Idona"));
        addComment(48, new Comment(118, "a", "Indira"));
        addComment(39, new Comment(119, "vitae, new Comment( orci.", "Angela"));
        addComment(26, new Comment(120, "nunc. Quisque ornare tortor at", "Kerry"));
        addComment(98, new Comment(121, "vehicula risus. Nulla eget", "Abraham"));
        addComment(63, new Comment(122, "at augue", "Lamar"));
        addComment(16, new Comment(123, "risus.", "Ulric"));
        addComment(10, new Comment(124, "nunc nulla vulputate dui, ", "Kamal"));
        addComment(79, new Comment(125, "quam, new Comment( elementum at, new Comment( egestas", "September"));
        addComment(75, new Comment(126, "gravida sagittis. Duis gravida.", "Paloma"));
        addComment(34, new Comment(127, "sit amet, new Comment( consectetuer adipiscing", "Tanek"));
        addComment(13, new Comment(128, "justo sit amet", "Courtney"));
        addComment(38, new Comment(129, "mollis lectus pede et risus.", "Tanek"));
        addComment(92, new Comment(130, "dui.", "Ira"));
        addComment(67, new Comment(131, "lobortis. Class", "Jared"));
        addComment(11, new Comment(132, "ipsum dolor sit amet, new Comment( consectetuer adipiscing", "Alyssa"));
        addComment(55, new Comment(133, "facilisis lorem", "Faith"));
        addComment(4, new Comment(134, "quis lectus. Nullam suscipit, ", "Dara"));
        addComment(41, new Comment(135, "Vivamus nibh dolor, new Comment( nonummy", "Fulton"));
        addComment(15, new Comment(136, "mauris", "Kane"));
        addComment(16, new Comment(137, "dignissim lacus. Aliquam rutrum lorem ac", "Julie"));
        addComment(46, new Comment(138, "nunc est, new Comment( mollis non, new Comment( cursus", "Whilemina"));
        addComment(39, new Comment(139, "varius orci, new Comment( in", "Tatyana"));
        addComment(39, new Comment(140, "tempor lorem, new Comment( eget mollis", "Gemma"));
        addComment(23, new Comment(141, "et magnis dis parturient montes, new Comment( nascetur", "May"));
        addComment(54, new Comment(142, "consequat nec, new Comment( mollis vitae, new Comment( posuere at, ", "Juliet"));
        addComment(35, new Comment(143, "rutrum lorem ac risus. Morbi", "Yoshio"));
        addComment(97, new Comment(144, "vitae erat vel pede blandit congue.", "Lani"));
        addComment(74, new Comment(145, "pellentesque a, ", "Anne"));
        addComment(81, new Comment(146, "Nunc commodo auctor velit. Aliquam nisl.", "Quinn"));
        addComment(80, new Comment(147, "enim consequat purus. Maecenas libero", "Karina"));
        addComment(81, new Comment(148, "eleifend vitae, new Comment( erat. Vivamus", "Elizabeth"));
        addComment(68, new Comment(149, "Fusce feugiat. Lorem", "Halee"));
        addComment(18, new Comment(150, "velit", "Jordan"));
        addComment(8, new Comment(151, "scelerisque neque sed", "Blaze"));
        addComment(66, new Comment(152, "Donec non justo. Proin non massa", "Bree"));
        addComment(12, new Comment(153, "nisl arcu", "Miriam"));
        addComment(34, new Comment(154, "sit amet ante. Vivamus non", "Arthur"));
        addComment(67, new Comment(155, "Aenean eget magna. Suspendisse tristique", "Julie"));
        addComment(73, new Comment(156, "dui, new Comment( nec", "Quinlan"));
        addComment(30, new Comment(157, "facilisi. Sed neque.", "Lucas"));
        addComment(1, new Comment(158, "Aenean egestas", "Lars"));
        addComment(98, new Comment(159, "luctus. Curabitur egestas", "Neville"));
        addComment(23, new Comment(160, "faucibus orci luctus et ultrices", "Christopher"));
        addComment(73, new Comment(161, "torquent per conubia", "Rajah"));
        addComment(60, new Comment(162, "Suspendisse", "Josiah"));
        addComment(95, new Comment(163, "neque. In ornare sagittis", "Hope"));
        addComment(48, new Comment(164, "eleifend nec, new Comment( malesuada ut, new Comment( sem. Nulla", "Noelani"));
        addComment(97, new Comment(165, "felis purus ac tellus. Suspendisse sed", "Jaquelyn"));
        addComment(24, new Comment(166, "neque", "Harper"));
        addComment(1, new Comment(167, "leo. Vivamus nibh dolor, ", "Jackson"));
        addComment(24, new Comment(168, "in felis. Nulla tempor augue ac", "Dolan"));
        addComment(98, new Comment(169, "Nam ac nulla. In tincidunt", "Taylor"));
        addComment(82, new Comment(170, "Class", "Dustin"));
        addComment(4, new Comment(171, "diam. Sed", "Keely"));
        addComment(93, new Comment(172, "sem mollis", "Ray"));
        addComment(8, new Comment(173, "orci", "Dexter"));
        addComment(81, new Comment(174, "vel arcu", "Gail"));
        addComment(61, new Comment(175, "libero et tristique", "Amena"));
        addComment(95, new Comment(176, "tellus sem", "Quinn"));
        addComment(14, new Comment(177, "neque pellentesque massa lobortis", "Logan"));
        addComment(19, new Comment(178, "magna nec quam. Curabitur vel lectus.", "Fulton"));
        addComment(44, new Comment(179, "risus, new Comment( at fringilla", "Echo"));
        addComment(61, new Comment(180, "Mauris quis turpis vitae", "Nathan"));
        addComment(55, new Comment(181, "pharetra", "Holly"));
        addComment(7, new Comment(182, "ornare sagittis felis. Donec tempor, ", "Timon"));
        addComment(1, new Comment(183, "nec, ", "Anika"));
        addComment(81, new Comment(184, "rutrum non, new Comment( hendrerit id, ", "Zelda"));
        addComment(37, new Comment(185, "eleifend non, new Comment( dapibus", "Alden"));
        addComment(26, new Comment(186, "nisl", "Tamara"));
        addComment(76, new Comment(187, "dui, new Comment( semper et, new Comment( lacinia", "Malachi"));
        addComment(66, new Comment(188, "lacinia at, new Comment( iaculis quis, new Comment( pede.", "Xantha"));
        addComment(58, new Comment(189, "quam, new Comment( elementum at, new Comment( egestas a, ", "Melyssa"));
        addComment(4, new Comment(190, "sem elit, new Comment( pharetra", "James"));
        addComment(9, new Comment(191, "ac arcu.", "Hilel"));
        addComment(72, new Comment(192, "enim commodo hendrerit. Donec porttitor", "Brendan"));
        addComment(32, new Comment(193, "Integer sem elit, new Comment( pharetra ut, ", "Francis"));
        addComment(100, new Comment(194, "a", "Wesley"));
        addComment(64, new Comment(195, "arcu. Curabitur ut odio vel", "Kylynn"));
        addComment(99, new Comment(196, "mus. Proin vel nisl. Quisque", "Jared"));
        addComment(31, new Comment(197, "ligula tortor, new Comment( dictum eu, new Comment( placerat eget, ", "Quemby"));
        addComment(68, new Comment(198, "Phasellus dolor elit, new Comment( pellentesque", "Tallulah"));
        addComment(24, new Comment(199, "posuere, new Comment( enim nisl", "Alana"));
        addComment(52, new Comment(200, "risus. Donec nibh enim, new Comment( gravida sit", "Judith"));
        addComment(49, new Comment(201, "Suspendisse non leo. Vivamus nibh", "Olympia"));
        addComment(93, new Comment(202, "tempus", "May"));
        addComment(42, new Comment(203, "rutrum lorem ac", "TaShya"));
        addComment(7, new Comment(204, "pede, ", "Madeline"));
        addComment(58, new Comment(205, "lectus sit amet luctus vulputate, new Comment( nisi", "Shelly"));
        addComment(22, new Comment(206, "cursus, new Comment( diam at pretium", "Neve"));
        addComment(89, new Comment(207, "Aenean", "Lee"));
        addComment(100, new Comment(208, "amet nulla.", "Benjamin"));
        addComment(12, new Comment(209, "malesuada fames ac turpis", "Stone"));
        addComment(49, new Comment(210, "arcu", "Ella"));
        addComment(80, new Comment(211, "Vestibulum accumsan neque et nunc. Quisque", "Alexis"));
        addComment(17, new Comment(212, "at pretium aliquet, ", "Ifeoma"));
        addComment(52, new Comment(213, "nec mauris blandit", "Deacon"));
        addComment(24, new Comment(214, "mollis. Integer tincidunt aliquam arcu.", "Kirsten"));
        addComment(25, new Comment(215, "et nunc. Quisque ornare tortor", "Marny"));
        addComment(89, new Comment(216, "fringilla ornare", "Michael"));
        addComment(61, new Comment(217, "dictum augue malesuada malesuada. Integer", "Alika"));
        addComment(73, new Comment(218, "nisi", "Lacy"));
        addComment(42, new Comment(219, "faucibus orci", "Nadine"));
        addComment(32, new Comment(220, "arcu. Vivamus sit amet", "Sylvester"));
        addComment(57, new Comment(221, "Cum sociis natoque penatibus", "Willa"));
        addComment(43, new Comment(222, "Aenean egestas hendrerit neque.", "Yvette"));
        addComment(17, new Comment(223, "a ultricies", "Harrison"));
        addComment(73, new Comment(224, "eleifend", "Gabriel"));
        addComment(30, new Comment(225, "sit amet massa. Quisque porttitor", "Thor"));
        addComment(75, new Comment(226, "lobortis", "Aubrey"));
        addComment(79, new Comment(227, "et ultrices posuere cubilia Curae;", "Ishmael"));
        addComment(98, new Comment(228, "vulputate, new Comment( risus a", "Lareina"));
        addComment(77, new Comment(229, "ac, new Comment( fermentum vel, new Comment( mauris.", "Keelie"));
        addComment(48, new Comment(230, "at augue", "Tyler"));
        addComment(93, new Comment(231, "ac orci. Ut semper pretium neque.", "Shelby"));
        addComment(16, new Comment(232, "feugiat non, ", "Sean"));
        addComment(6, new Comment(233, "eleifend", "Vladimir"));
        addComment(80, new Comment(234, "erat vel pede", "Steel"));
        addComment(73, new Comment(235, "purus. Maecenas libero est, new Comment( congue a, ", "Irene"));
        addComment(49, new Comment(236, "Nullam lobortis quam a felis", "Jackson"));
        addComment(20, new Comment(237, "euismod", "Addison"));
        addComment(70, new Comment(238, "arcu. Sed eu nibh vulputate mauris", "Clementine"));
        addComment(58, new Comment(239, "erat, new Comment( eget tincidunt dui", "Byron"));
        addComment(9, new Comment(240, "venenatis", "Wynne"));
        addComment(32, new Comment(241, "mi tempor", "Jayme"));
        addComment(21, new Comment(242, "ridiculus mus. Proin vel", "Raja"));
        addComment(98, new Comment(243, "mauris, new Comment( rhoncus id, new Comment( mollis nec, new Comment( cursus", "Justin"));
        addComment(27, new Comment(244, "cubilia Curae; Donec tincidunt. Donec", "Xaviera"));
        addComment(65, new Comment(245, "a nunc. In", "Andrew"));
        addComment(55, new Comment(246, "purus mauris a", "Ralph"));
        addComment(95, new Comment(247, "quis urna. Nunc", "Iola"));
        addComment(96, new Comment(248, "neque. In ornare sagittis felis.", "Jenette"));
        addComment(79, new Comment(249, "Curae; Donec", "Dieter"));
        addComment(7, new Comment(250, "elit. Aliquam auctor, new Comment( velit", "Jaden"));
        addComment(95, new Comment(251, "consequat dolor vitae", "Hiram"));
        addComment(67, new Comment(252, "sapien molestie orci tincidunt adipiscing. Mauris", "Kiara"));
        addComment(57, new Comment(253, "Vivamus non lorem vitae odio", "Aline"));
        addComment(59, new Comment(254, "tincidunt pede ac urna. Ut", "Joan"));
        addComment(78, new Comment(255, "dictum augue malesuada malesuada. Integer", "Stacy"));
        addComment(59, new Comment(256, "erat volutpat. Nulla dignissim. Maecenas", "Nissim"));
        addComment(24, new Comment(257, "lorem lorem, new Comment( luctus", "Imani"));
        addComment(74, new Comment(258, "lectus quis massa. Mauris", "Emily"));
        addComment(46, new Comment(259, "libero est, ", "Abel"));
        addComment(9, new Comment(260, "feugiat tellus lorem eu metus.", "Leah"));
        addComment(100, new Comment(261, "amet, new Comment( consectetuer adipiscing elit. Etiam", "Katell"));
        addComment(94, new Comment(262, "sagittis. Nullam vitae diam. Proin dolor.", "Valentine"));
        addComment(66, new Comment(263, "felis eget varius ultrices, new Comment( mauris ipsum", "Inez"));
        addComment(78, new Comment(264, "semper. Nam tempor diam dictum sapien.", "Carissa"));
        addComment(63, new Comment(265, "nisl. Maecenas malesuada fringilla", "Perry"));
        addComment(28, new Comment(266, "nulla.", "Maggie"));
        addComment(99, new Comment(267, "In scelerisque scelerisque", "TaShya"));
        addComment(10, new Comment(268, "Duis risus", "Rhona"));
        addComment(45, new Comment(269, "justo. Praesent luctus. Curabitur egestas nunc", "Jenette"));
        addComment(79, new Comment(270, "sollicitudin a, new Comment( malesuada id, new Comment( erat.", "Ella"));
        addComment(4, new Comment(271, "Donec felis orci, ", "Noel"));
        addComment(14, new Comment(272, "Praesent interdum ligula", "Blythe"));
        addComment(25, new Comment(273, "aliquet. Phasellus fermentum", "Brynn"));
        addComment(93, new Comment(274, "dui. Cras pellentesque. Sed dictum.", "Jaden"));
        addComment(5, new Comment(275, "a", "Audra"));
        addComment(64, new Comment(276, "vitae", "Pandora"));
        addComment(52, new Comment(277, "natoque penatibus et magnis dis", "Gary"));
        addComment(46, new Comment(278, "egestas rhoncus. Proin", "Emily"));
        addComment(67, new Comment(279, "lacus", "Carter"));
        addComment(10, new Comment(280, "tincidunt", "Conan"));
        addComment(18, new Comment(281, "Nunc lectus pede, new Comment( ultrices a, new Comment( auctor", "Rana"));
        addComment(78, new Comment(282, "magna. Nam ligula elit, new Comment( pretium", "Kelsie"));
        addComment(31, new Comment(283, "amet lorem semper auctor. Mauris vel", "Uriel"));
        addComment(35, new Comment(284, "mattis", "Mara"));
        addComment(3, new Comment(285, "Mauris nulla.", "Otto"));
        addComment(1, new Comment(286, "eu, new Comment( odio. Phasellus at augue", "Zenia"));
        addComment(41, new Comment(287, "Cras vehicula aliquet libero. Integer in", "Quincy"));
        addComment(11, new Comment(288, "suscipit nonummy. Fusce", "Amy"));
        addComment(40, new Comment(289, "facilisis eget, new Comment( ipsum.", "Lacey"));
        addComment(27, new Comment(290, "Mauris vel", "Valentine"));
        addComment(18, new Comment(291, "vel, new Comment( faucibus", "Meghan"));
        addComment(87, new Comment(292, "lacus. Mauris non dui", "Carlos"));
        addComment(26, new Comment(293, "erat nonummy", "Yael"));
        addComment(57, new Comment(294, "Nulla eget metus eu erat semper", "Emma"));
        addComment(90, new Comment(295, "nec, ", "Chava"));
        addComment(86, new Comment(296, "vehicula", "Sasha"));
        addComment(96, new Comment(297, "tincidunt adipiscing. Mauris molestie pharetra", "Riley"));
        addComment(79, new Comment(298, "nibh. Aliquam", "Jeremy"));
        addComment(11, new Comment(299, "massa. Mauris vestibulum, new Comment( neque sed dictum", "Thane"));
        addComment(53, new Comment(300, "rutrum magna. Cras convallis convallis dolor.", "Ralph"));
    }

    private void printComments(Map mp) {
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }
    }

    public List<Comment> getComments (long messageId){
//        Map<Long, Comment> comments = messages.get(messageId).getComments();
        printComments(comments);
        return new ArrayList<>(comments.values());
    }

    public Comment getComment (long messageId, long commentId) {
//        Map<Long, Comment> comments = messages.get(messageId).getComments();
        return comments.get(commentId);
    }

    public Comment addComment(long messageId, Comment comment) {
//        Map<Long, Comment> comments = messages.get(messageId).getComments();
        comments.put(comment.getId(), comment);
        return comment;
    }

    public Comment updateComment (long messageId, Comment comment) {
//        Map<Long, Comment> comments = messages.get(messageId).getComments();
        if (comment.getId() == 0) {
            return null;
        }
        comments.put(comment.getId(), comment);
        return comment;
    }

    public Comment removeComment (long messageId, long commentId) {
//        Map<Long, Comment> comments = messages.get(messageId).getComments();
        return comments.remove(commentId);
    }
}
