package com.mindtree.devops.controller;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DevopsController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String menu() {	
		return "menu";
	}
	@RequestMapping("/devops")
	public String devops()
	{
		return "devops";
	}
	@RequestMapping("/tools")
	public String tools()
	{
		return "tools";
	}
	@RequestMapping("/developer")
	public String developer()
	{
		 try {
		        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/main/resources/static/happy.wav").getAbsoluteFile());
		        Clip clip = AudioSystem.getClip();
		        clip.open(audioInputStream);
		        clip.start();
		    } catch(Exception ex) {
		        System.out.println("Error with playing sound.");
		        ex.printStackTrace();
		    }		
		return "developer";
	}
	@RequestMapping("/git")
	public String git()
	{
		return "git";
	}
	@RequestMapping("/jenkins")
	public String jenkins()
	{
		return "jenkins";
	}
	@RequestMapping("/maven")
	public String maven()
	{
		return "maven";
	}
	@RequestMapping("/sonarqube")
	public String sonarqube()
	{
		return "sonarqube";
	}
	@RequestMapping("/artifactory")
	public String artifactory()
	{
		return "artifactory";
	}
	@RequestMapping("/docker")
	public String docker()
	{
		return "docker";
	}
	@RequestMapping("/ansible")
	public String ansible()
	{
		return "ansible";
	}
	@RequestMapping("/terraform")
	public String terraform()
	{
		return "terraform";
	}
	
}
