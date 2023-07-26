package ex07_TourGuide;

public class TourGuide implements Tour {

  // Field
  private Tour tour;

  // Method
  public Tour getTour() {
    return tour;
  }

  public void setTour(Tour tour) {
    this.tour = tour;
  }
  
  public void sightseeing() {
    tour.sightseeing();
  }
  
  public void leisure() {
    tour.leisure();
  }
  
  public void meal() {
    tour.meal();
  }
}
