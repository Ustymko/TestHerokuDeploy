package messages.util;

import messages.entity.MessageEntity;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.PrintWriter;
import java.util.List;

public class WriteCsvToResponse {
    private static final Logger LOGGER = LoggerFactory.getLogger(WriteCsvToResponse.class);

    public static void writeCities(PrintWriter writer, List<MessageEntity> messages) {

        try {

            var builder = getStatefulBean(writer);
            builder.write(messages);

        } catch (CsvException ex) {

            LOGGER.error("Error mapping Bean to CSV", ex);
        }
    }

    private static StatefulBeanToCsv<MessageEntity> getStatefulBean(PrintWriter writer) {

        ColumnPositionMappingStrategy<MessageEntity> mapStrategy
            = new ColumnPositionMappingStrategy<>();

        mapStrategy.setType(MessageEntity.class);

        String[] columns = new String[]{"messageId", "messageBody", "isAdvertisement", "sendDate", "group", "user"};
        mapStrategy.setColumnMapping(columns);

        StatefulBeanToCsv<MessageEntity> builder = new StatefulBeanToCsvBuilder<MessageEntity>(writer)
            .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
            .withMappingStrategy(mapStrategy)
            .withSeparator(',')
            .build();

        return builder;
    }
}
