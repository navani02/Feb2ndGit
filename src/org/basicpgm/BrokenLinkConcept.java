package org.basicpgm;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import zmq.ZError.IOException;

public class BrokenLinkConcept {

	public static void main(String[] args) throws java.io.IOException {
		// browser
		WebDriver driver = new ChromeDriver();

		// to launch the URL 
		driver.get("https://www.facebook.com/");

		// to get the all links
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		System.out.println("All links count:" + allLinks.size());

		for (WebElement links : allLinks) {
			String link = links.getAttribute("href");

			if (link != null) {
				URL url;
				try {
					// 1.LinkUrl (String)---- convert to URL
					url = new URL(link);

					// 2.Establish connect --- URL Connection
					URLConnection urlCon = url.openConnection();

					// 3.convert URL connection to HTTPConnection (DownCasting)
					HttpURLConnection http = (HttpURLConnection) urlCon;

					// 4.we can get response code for HTTpConnection
					int code = http.getResponseCode();

					if (code != 200) {
						System.out.println(link + "-->"+ code);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
