package de.trion.gitlabcimavencvescan;

import org.apache.logging.log4j.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class CVE_2025_22228 implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(CVE_2025_22228.class);
    @Override
    public void run(String... args) {
        var passwordEncoder = new BCryptPasswordEncoder();
        var password = Strings.repeat("a", 73);
        var encodedPassword = passwordEncoder.encode(password);
        var passwordToCheck = Strings.repeat("a", 72);
        // true
        var matches = new BCryptPasswordEncoder().matches(passwordToCheck, encodedPassword);
        log.error("Matches: {}", matches);
    }
}
