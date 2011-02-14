package gov.nih.nci.ncia.verifysubmission;

import java.util.Collections;
import java.util.Date;
import java.util.SortedMap;

/**
 * This is generated by the AccrualReportGenerator.  This contains
 * all the information necessary to show accrual counts within
 * a time frame.
 * 
 * <p>This object is meant to be immutable.
 */
public class AccrualReport {

	/**
	 * Constructor.  All parameters feed through here
	 * to avoid setters that would violate immutability.
	 */
    public AccrualReport(long newPatientCount, 
                         long updatedPatientCount,
                         long correctedPatientCount, 
                         long newStudyCount,
                         long updatedStudyCount, 
                         long correctedStudyCount,
                         long newSeriesCount, 
                         long updatedSeriesCount,
                         long correctedSeriesCount, 
                         long correctedImageCount,
                         long newImageCount,
                         SortedMap<Date, Integer> accrualDays,
                         Date from,
                         Date to,
                         String collectionSite) {
        this.newPatientCount = newPatientCount;
        this.updatedPatientCount = updatedPatientCount;
        this.correctedPatientCount = correctedPatientCount;
        this.newStudyCount = newStudyCount;
        this.updatedStudyCount = updatedStudyCount;
        this.correctedStudyCount = correctedStudyCount;
        this.newSeriesCount = newSeriesCount;
        this.updatedSeriesCount = updatedSeriesCount;
        this.correctedSeriesCount = correctedSeriesCount;
        this.correctedImageCount = correctedImageCount;
        this.newImageCount = newImageCount;
        this.accrualDays = accrualDays;
		this.from = from;
		this.to = to;	
		this.collectionSite = collectionSite;
    }    
    
    public long getNewPatientCount() {
        return newPatientCount;
    }
    
    public long getUpdatedPatientCount() {
        return updatedPatientCount;
    }
    
    public long getCorrectedPatientCount() {
        return correctedPatientCount;
    }
    
    public long getNewStudyCount() {
        return newStudyCount;
    }
    
    public long getUpdatedStudyCount() {
        return updatedStudyCount;
    }
    
    public long getCorrectedStudyCount() {
        return correctedStudyCount;
    }
    
    public long getNewSeriesCount() {
        return newSeriesCount;
    }
    
    public long getUpdatedSeriesCount() {
        return updatedSeriesCount;
    }
    
    public long getCorrectedSeriesCount() {
        return correctedSeriesCount;
    }
    
    public long getCorrectedImageCount() {
        return correctedImageCount;
    }
    
    public long getNewImageCount() {
        return newImageCount;
    }

    /**
     * For each day in the day range that has a submission relevant
     * to this report, there is an entry in this map.  Further,
     * the number of relevant submissions on that day are associated
     * with the day.
     */
    public SortedMap<Date, Integer> getAccrualDays() {
        return Collections.unmodifiableSortedMap(accrualDays);
    }
    
    /**
     * The starting day for the report. 
     */
	public Date getFrom() {
		return new Date(from.getTime());
	}
	
    /**
     * The end day for the report (inclusive). 
     */	
	public Date getTo() {
		return new Date(to.getTime());
	}	
	
	/**
	 * The collection+site this report is relevant to
	 */
	public String getCollectionSite(){		
		return collectionSite;
	}

    ////////////////////////////////////PRIVATE//////////////////////////////////
    
    private SortedMap<Date, Integer> accrualDays;
    
    private long newPatientCount;
    private long updatedPatientCount;
    private long correctedPatientCount;

    private long newStudyCount;
    private long updatedStudyCount;
    private long correctedStudyCount;

    private long newSeriesCount;
    private long updatedSeriesCount;
    private long correctedSeriesCount;

    private long correctedImageCount;
    private long newImageCount;   
    
	private Date from;
	
	private Date to;    
	
	private String collectionSite;
}