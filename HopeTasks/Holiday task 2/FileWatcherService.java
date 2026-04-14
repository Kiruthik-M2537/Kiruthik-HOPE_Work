package Holiday task 2;
import java.nio.file.*;

public class FileWatcherService {
    public static void main(String[] args) throws Exception {

        Path path = Paths.get("C:/watchfolder");

        WatchService watchService = FileSystems.getDefault().newWatchService();

        path.register(watchService,
                StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_DELETE,
                StandardWatchEventKinds.ENTRY_MODIFY);

        System.out.println("Watching folder: " + path);

        while (true) {
            WatchKey key = watchService.take();

            for (WatchEvent<?> event : key.pollEvents()) {
                WatchEvent.Kind<?> kind = event.kind();
                Path file = (Path) event.context();

                System.out.println(kind.name() + " : " + file);
            }

            key.reset();
        }
    }
}