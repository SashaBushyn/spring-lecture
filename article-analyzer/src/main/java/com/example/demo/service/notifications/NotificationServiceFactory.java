package com.example.demo.service.notifications;

import com.example.demo.model.NotificationType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NotificationServiceFactory {

  private final EmailNotificationService emailNotificationService;
  private final SlackNotificationService slackNotificationService;

  public NotificationService getNotificationService(NotificationType type) {
    return switch (type) {
      case EMAIL -> emailNotificationService;
      case SLACK -> slackNotificationService;
    };
  }
}
