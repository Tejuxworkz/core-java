class ProjectDTO{

	   public ProjectDTO(){
		System.out.println("Project Object is created");
	   }

	   private String projectName;
	   private int noOfMembers;
	   private String guideName;
	   private boolean isProjectCompleted;
	   
	   
	   public String getProjectName(){
		return projectName;
	   }
	   
	   public void setProjectName(String projectName){
		this.projectName=projectName;
	   }
	   
	   public int getNoOfMembers(){
		return noOfMembers;
	   }

	   public void setNoOfMembers(int noOfMembers){
		this.noOfMembers=noOfMembers;
	   }
	   
	   public String getGuideName(){
		return guideName;
	   }

	   public void setGuideName(String guideName){
		this.guideName=guideName;
	   }
	   
	   public boolean getIsProjectCompleted(){
		return isProjectCompleted;
	   }

	   public void setIsProjectCompleted(boolean isProjectCompleted){
		this.isProjectCompleted=isProjectCompleted;
	   }

}