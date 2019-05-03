package section6.geo;

public class GeocoderResponse {
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getZoneName() {
		return zoneName;
	}
	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	public Long getGmtOffset() {
		return gmtOffset;
	}
	public void setGmtOffset(Long gmtOffset) {
		this.gmtOffset = gmtOffset;
	}
	public String getDst() {
		return dst;
	}
	public void setDst(String dst) {
		this.dst = dst;
	}
	public String getZoneStart() {
		return zoneStart;
	}
	public void setZoneStart(String zoneStart) {
		this.zoneStart = zoneStart;
	}
	public String getZoneEnd() {
		return zoneEnd;
	}
	public void setZoneEnd(String zoneEnd) {
		this.zoneEnd = zoneEnd;
	}
	public String getNextAbbreviation() {
		return nextAbbreviation;
	}
	public void setNextAbbreviation(String nextAbbreviation) {
		this.nextAbbreviation = nextAbbreviation;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getFormatted() {
		return formatted;
	}
	public void setFormatted(String formatted) {
		this.formatted = formatted;
	}
	private String message;
	private String countryCode;
	private String countryName;
	private String zoneName;
	private String abbreviation;
	private Long gmtOffset;
	private String dst;
	private String zoneStart;
	private String zoneEnd;
	private String nextAbbreviation;
	private String timestamp;
	private String formatted;
}