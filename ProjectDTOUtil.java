class ProjectDTOUtil{

	public static void main(String a[]){
	
		ProjectDTO prodto=new ProjectDTO();
		
		prodto.setProjectName("Disinfectant-Robot");
		prodto.setNoOfMembers(4);
		prodto.setGuideName("Khaja-Moinuddin");
		prodto.setIsProjectCompleted(true);
		
	System.out.println(prodto.getProjectName()+" "+prodto.getNoOfMembers()+" "+prodto.getGuideName()+" "+prodto.getIsProjectCompleted());
	}

}