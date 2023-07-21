package com.artemdev;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "MyPlugin")
public class HelloMojo extends AbstractMojo {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    @Parameter(defaultValue = "Hello from plugin!", property = "hello.message")
    private String message;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(message);
    }
}