import React from 'react';
import styles from './CohortDetails.module.css';

const cohorts = [
  {
    id: 'FS-React-Jan24',
    status: 'ongoing',
    startDate: '2024-01-15',
    endDate: '2024-03-15',
  },
  {
    id: 'FS-Java-Dec23',
    status: 'completed',
    startDate: '2023-12-01',
    endDate: '2024-02-01',
  },
  {
    id: 'FS-Node-Feb24',
    status: 'ongoing',
    startDate: '2024-02-20',
    endDate: '2024-04-20',
  },
  {
    id: 'FS-Python-Nov23',
    status: 'completed',
    startDate: '2023-11-10',
    endDate: '2024-01-10',
  },
];

export default function CohortDetails() {
  return (
    <div className={styles.container}>
      <div className={styles.boxContainer}>
        {cohorts.map((cohort) => (
          <div key={cohort.id} className={styles.box}>
            <h3
              className={styles.cohortTitle}
              style={{ color: cohort.status === 'ongoing' ? 'green' : 'blue' }}
            >
              {cohort.id}
            </h3>
            <dl>
              <dt>Status</dt>
              <dd>{cohort.status}</dd>
              <dt>Start Date</dt>
              <dd>{cohort.startDate}</dd>
              <dt>End Date</dt>
              <dd>{cohort.endDate}</dd>
            </dl>
          </div>
        ))}
      </div>
    </div>
  );
}
