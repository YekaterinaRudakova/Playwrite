package browserlauncher;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserLauncher {
    public static void main(String[] args) {
        BrowserFactory factory = new ChromiumBrowserFactory();
        try (Playwright playwright = Playwright.create()) {
            Browser browser = factory.createBrowser(playwright);
            Page page = browser.newPage();
            page.navigate("https://www.onliner.by/");
            System.out.println("заголовок " + page.title());
        }
    }
}

