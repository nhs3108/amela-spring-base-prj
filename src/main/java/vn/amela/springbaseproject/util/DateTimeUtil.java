package vn.amela.springbaseproject.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtil {
	/**
	 * Format LocalDateTime to String with pattern
	 * @param dateTime
	 * @param pattern
	 * @throws IllegalArgumentException if pattern is invalid
	 * @return String
	 */
	public static String format(LocalDateTime dateTime, String pattern) {
		var dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
		return dateTimeFormatter.format(dateTime);
	}
	
	/**
	 * Parse String to LocalDateTime with pattern
	 * @param dateTime
	 * @param pattern refer @see vn.amela.springbaseproject.consts.DateTimeFormat
	 * @throws IllegalArgumentException if pattern is invalid
	 * @return LocalDateTime
	 */
	public static LocalDateTime parse(String dateTime, String pattern) {
		var dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
		return LocalDateTime.parse(dateTime, dateTimeFormatter);
	}
	
	public static LocalDate beginDateOfMonth(LocalDate date) {
		return LocalDate.of(date.getYear(), date.getMonth(), 1);
	}
	
	public static LocalDate endDateOfMonth(LocalDate date) {
		return LocalDate.of(date.getYear(), date.getMonth(), date.lengthOfMonth());
	}
	
	public static LocalDateTime beginDateTimeOfMonth(LocalDate date) {
		return beginDateOfMonth(date).atTime(LocalTime.MIN);
	}
	
	public static LocalDateTime endDateTimeOfMonth(LocalDate date) {
		return endDateOfMonth(date).atTime(LocalTime.MAX);
	}
}
