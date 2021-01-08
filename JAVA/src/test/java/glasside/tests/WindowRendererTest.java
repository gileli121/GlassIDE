package glasside.tests;


import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import glasside.helpers.WindowRenderer;

public class WindowRendererTest extends BasePlatformTestCase {

    private WindowRenderer getWindowRenderer() {
        return null;//new WindowRenderer(0x0000000000080DEE);
    }

    public void testEnableRenderer() {
        WindowRenderer renderer = getWindowRenderer();
        renderer.enableEffect(true,0,50,0);
    }

    public void testDisableRenderer() throws InterruptedException {
        WindowRenderer renderer = getWindowRenderer();
        renderer.enableEffect(true,0,50,0);
        renderer.disable();
    }

}