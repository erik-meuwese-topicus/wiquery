package org.wicketstuff.wiquery.ui.themes;

import java.util.stream.Stream;

/**
 * Enumeration of all possible icons from the jQuery UI theme
 * 
 * All possible icons are displayed here : http://jqueryui.com/themeroller/#themeGallery
 * 
 * @author Julien roche
 * @author Ernesto Reinaldo
 * 
 */
public enum UiIcon {
	CARAT_1_NORTH("carat-1-n"),
	CARAT_1_NORTH_EAST("carat-1-ne"),
	CARAT_1_EAST("carat-1-e"),
	CARAT_1_SOUTH_EAST("carat-1-se"),
	CARAT_1_SOUTH("carat-1-s"),
	CARAT_1_SOUTH_WEST("carat-1-sw"),
	CARAT_1_WEST("carat-1-w"),
	CARAT_1_NORTH_WEST("carat-1-nw"),
	CARAT_2_NORTH_SOUTH("carat-2-n-s"),
	CARAT_2_EAST_WEST("carat-2-e-w"),
	TRIANGLE_1_NORTH("triangle-1-n"),
	TRIANGLE_1_NORTH_EAST("triangle-1-ne"),
	TRIANGLE_1_EAST("triangle-1-e"),
	TRIANGLE_1_SOUTH_EAST("triangle-1-se"),
	TRIANGLE_1_SOUTH("triangle-1-s"),
	TRIANGLE_1_SOUTH_WEST("triangle-1-sw"),
	TRIANGLE_1_WEST("triangle-1-w"),
	TRIANGLE_1_NORTH_WEST("triangle-1-nw"),
	TRIANGLE_2_NORTH_SOUTH("triangle-2-n-s"),
	TRIANGLE_2_EAST_WEST("triangle-2-e-w"),
	ARROW_1_NORTH("arrow-1-n"),
	ARROW_1_NORTH_EAST("arrow-1-ne"),
	ARROW_1_EAST("arrow-1-e"),
	ARROW_1_SOUTH_EAST("arrow-1-se"),
	ARROW_1_SOUTH("arrow-1-s"),
	ARROW_1_SOUTH_WEST("arrow-1-sw"),
	ARROW_1_WEST("arrow-1-w"),
	ARROW_1_NORTH_WEST("arrow-1-nw"),
	ARROW_2_NORTH_SOUTH("arrow-2-n-s"),
	ARROW_2_NORTH_EAST_SOUTH_WEST("arrow-2-ne-sw"),
	ARROW_2_EAST_WEST("arrow-2-e-w"),
	ARROW_2_SOUTH_EAST_NORTH_WEST("arrow-2-se-nw"),
	ARROWSTOP_1_NORTH("arrowstop-1-n"),
	ARROWSTOP_1_EAST("arrowstop-1-e"),
	ARROWSTOP_1_SOUTH("arrowstop-1-s"),
	ARROWSTOP_1_WEST("arrowstop-1-w"),
	ARROWTHICK_1_NORTH("arrowthick-1-n"),
	ARROWTHICK_1_NORTH_EAST("arrowthick-1-ne"),
	ARROWTHICK_1_EAST("arrowthick-1-e"),
	ARROWTHICK_1_SOUTH_EAST("arrowthick-1-se"),
	ARROWTHICK_1_SOUTH("arrowthick-1-s"),
	ARROWTHICK_1_SOUTH_WEST("arrowthick-1-sw"),
	ARROWTHICK_1_WEST("arrowthick-1-w"),
	ARROWTHICK_1_NORTH_WEST("arrowthick-1-nw"),
	ARROWTHICK_2_NORTH_SOUTH("arrowthick-2-n-s"),
	ARROWTHICK_2_NORTH_EAST_SOUTH_WEST("arrowthick-2-ne-sw"),
	ARROWTHICK_2_EAST_WEST("arrowthick-2-e-w"),
	ARROWTHICK_2_SOUTH_EAST_NORTH_WEST("arrowthick-2-se-nw"),
	ARROWTHICKSTOP_1_NORTH("arrowthickstop-1-n"),
	ARROWTHICKSTOP_1_EAST("arrowthickstop-1-e"),
	ARROWTHICKSTOP_1_SOUTH("arrowthickstop-1-s"),
	ARROWTHICKSTOP_1_WEST("arrowthickstop-1-w"),
	ARROWRETURNTHICK_1_NORTH("arrowreturnthick-1-n"),
	ARROWRETURNTHICK_1_EAST("arrowreturnthick-1-e"),
	ARROWRETURNTHICK_1_SOUTH("arrowreturnthick-1-s"),
	ARROWRETURNTHICK_1_WEST("arrowreturnthick-1-w"),
	ARROWRETURN_1_NORTH("arrowreturn-1-n"),
	ARROWRETURN_1_EAST("arrowreturn-1-e"),
	ARROWRETURN_1_SOUTH("arrowreturn-1-s"),
	ARROWRETURN_1_WEST("arrowreturn-1-w"),
	ARROWREFRESH_1_NORTH("arrowrefresh-1-n"),
	ARROWREFRESH_1_EAST("arrowrefresh-1-e"),
	ARROWREFRESH_1_SOUTH("arrowrefresh-1-s"),
	ARROWREFRESH_1_WEST("arrowrefresh-1-w"),
	ARROW_4("arrow-4"),
	ARROW_4_DIAG("arrow-4-diag"),
	EXTLINK("extlink"),
	NEWWIN("newwin"),
	REFRESH("refresh"),
	SHUFFLE("shuffle"),
	TRANSFER_E_W("transfer-e-w"),
	TRANSFERTHICK_E_W("transferthick-e-w"),
	FOLDER_COLLAPSED("folder-collapsed"),
	FOLDER_OPEN("folder-open"),
	DOCUMENT("document"),
	DOCUMENT_B("document-b"),
	NOTE("note"),
	MAIL_CLOSED("mail-closed"),
	MAIL_OPEN("mail-open"),
	SUITCASE("suitcase"),
	COMMENT("comment"),
	PERSON("person"),
	PRINT("print"),
	TRASH("trash"),
	LOCKED("locked"),
	UNLOCKED("unlocked"),
	BOOKMARK("bookmark"),
	TAG("tag"),
	HOME("home"),
	FLAG("flag"),
	CALENDAR("calendar"),
	CART("cart"),
	PENCIL("pencil"),
	CLOCK("clock"),
	DISK("disk"),
	CALCULATOR("calculator"),
	ZOOMIN("zoomin"),
	ZOOMOUT("zoomout"),
	SEARCH("search"),
	WRENCH("wrench"),
	GEAR("gear"),
	HEART("heart"),
	STAR("star"),
	LINK("link"),
	CANCEL("cancel"),
	PLUS("plus"),
	PLUSTHICK("plusthick"),
	MINUS("minus"),
	MINUSTHICK("minusthick"),
	CLOSE("close"),
	CLOSETHICK("closethick"),
	KEY("key"),
	LIGHTBULB("lightbulb"),
	SCISSORS("scissors"),
	CLIPBOARD("clipboard"),
	COPY("copy"),
	CONTACT("contact"),
	IMAGE("image"),
	VIDEO("video"),
	SCRIPT("script"),
	ALERT("alert"),
	NOTICE("notice"),
	HELP("help"),
	CHECK("check"),
	BULLET("bullet"),
	RADIO_OFF("radio-off"),
	RADIO_ON("radio-on"),
	PIN_WEST("pin-w"),
	PIN_SOUTH("pin-s"),
	PLAY("play"),
	PAUSE("pause"),
	SEEK_NEXT("seek-next"),
	SEEK_PREV("seek-prev"),
	SEEK_END("seek-end"),
	SEEK_FIRST("seek-first"),
	STOP("stop"),
	EJECT("eject"),
	VOLUME_OFF("volume-off"),
	VOLUME_ON("volume-on"),
	POWER("power"),
	SIGNAL_DIAG("signal-diag"),
	SIGNAL("signal"),
	BATTERY_0("battery-0"),
	BATTERY_1("battery-1"),
	BATTERY_2("battery-2"),
	BATTERY_3("battery-3"),
	CIRCLE_PLUS("circle-plus"),
	CIRCLE_MINUS("circle-minus"),
	CIRCLE_CLOSE("circle-close"),
	CIRCLE_ZOOMIN("circle-zoomin"),
	CIRCLE_ZOOMOUT("circle-zoomout"),
	CIRCLE_CHECK("circle-check"),
	CIRCLE_TRIANGLE_NORTH("circle-triangle-n"),
	CIRCLE_TRIANGLE_EAST("circle-triangle-e"),
	CIRCLE_TRIANGLE_SOUTH("circle-triangle-s"),
	CIRCLE_TRIANGLE_WEST("circle-triangle-w"),
	CIRCLE_ARROW_NORTH("circle-arrow-n"),
	CIRCLE_ARROW_EAST("circle-arrow-e"),
	CIRCLE_ARROW_SOUTH("circle-arrow-s"),
	CIRCLE_ARROW_WEST("circle-arrow-w"),
	CIRCLESMALL_PLUS("circlesmall-plus"),
	CIRCLESMALL_MINUS("circlesmall-minus"),
	CIRCLESMALL_CLOSE("circlesmall-close"),
	SQUARESMALL_PLUS("squaresmall-plus"),
	SQUARESMALL_MINUS("squaresmall-minus"),
	SQUARESMALL_CLOSE("squaresmall-close"),
	GRIP_DOTTED_VERTICAL("grip-dotted-vertical"),
	GRIP_DOTTED_HORIZONTAL("grip-dotted-horizontal"),
	GRIP_SOLID_VERTICAL("grip-solid-vertical"),
	GRIP_SOLID_HORIZONTAL("grip-solid-horizontal"),
	GRIPSMALL_DIAGONAL_SE("gripsmall-diagonal-se"),
	GRIP_DIAGONAL_SE("grip-diagonal-se"),
	INFO("info"),
	BLANK("blank");

	// --------
	// Properties
	private String cssClass;

	/**
	 * Constructor
	 * 
	 * @param cssClass
	 *            Associated CSS class
	 */
	UiIcon(String cssClass)
	{
		this.cssClass = cssClass;
	}

	/**
	 * @return the associated CSS class
	 */
	public String getCssClass()
	{
		return "ui-icon-" + cssClass;
	}

	public static UiIcon forCssClass(String cssClass)
	{
		if (cssClass == null)
			return null;
		
		return Stream.of(UiIcon.values())
			.filter(i -> i.getCssClass().equals(cssClass))
			.findFirst()
			.get();
	}
}